/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.implementacao.crud;

import br.com.framework.hibernate.session.HibernateUtil;
import br.com.framework.interfac.crud.InterfaceCrud;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eu
 * @param <T>
 */
public abstract class ImplementacaoCrud<T> implements InterfaceCrud<T>, Serializable {

    private static final long serialVersionUID = 1L;
    private static Session s = HibernateUtil.getSessionfactory().openSession();
    private static Transaction t = s.beginTransaction();

// =============================================================================================================================================
    
    /**
     * Roda instantaneamente o sql no banco de dados
     *
     * @throws Exception
     */
    private void executeFlushSession() throws Exception {
        s.flush();
    }

    protected Session getSessao(){
        return this.s;
    }
// =============================================================================================================================================
    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        
        try{
        t.begin();
        }catch(TransactionException e){
            t = s.beginTransaction();
        }
        
        s.saveOrUpdate(obj);
        t.commit();
        this.executeFlushSession();
    }

    @Override
    public void delete(T obj) throws Exception {
        
        try{
        t.begin();
        }catch(TransactionException e){
            t = s.beginTransaction();
        }
        
        t.begin();
        s.delete(obj);
        t.commit();
        this.executeFlushSession();
    }

    @Override
    public List<T> finList(Class<T> obj) throws Exception {
        return s.createCriteria(obj).list();
    }

    @Override
    public List<T> finList(Class<T> obj, String campo, String txt) throws Exception {
        return s.createCriteria(obj).add(Restrictions.like(campo, "%" + txt + "%")).list();
    }
    
    public List<T> finList(Class<T> obj, String campo1,String campo2, String txt) throws Exception {
        return s.createCriteria(obj).add(Restrictions.like(campo1, "%" + txt + "%"))
                .add(Restrictions.like(campo2, "%" + txt + "%")).list();
    }

    @Override
    public Object findById(Class<T> entidade, Long id) throws Exception {
        return null;
    }

    public List<T> findListByNamedQueryDinamica(String query) throws Exception {
        return s.getNamedQuery(query).list();
    }
    
    @Override
    public List<T> findListByQueryDinamica(String query) throws Exception {
        return s.createQuery(query).list();
    }

    @Override
    public Object findById(Class<T> entidade) throws Exception {
        return s.createCriteria(entidade).uniqueResult();
    }

    public Object findQueryDinamica(String txt) throws Exception {
        return (Object) s.createQuery(txt).uniqueResult();
    }
    
    public Object findNamedQueryDinamica(String txt) throws Exception {
        return (Object) s.getNamedQuery(txt).uniqueResult();
    }
}
