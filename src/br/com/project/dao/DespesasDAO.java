/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Despesas;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eu
 */
public class DespesasDAO extends ImplementacaoCrud<Despesas>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Despesas> finList(Class<Despesas> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Despesas> finPagas(Class<Despesas> obj) throws Exception {
        
        return (List<Despesas>) getSessao().createQuery("SELECT d FROM Despesas d WHERE d.pago = true ORDER BY d.idDespesa desc").list();
    }
    
    public List<Despesas> finNPagas(Class<Despesas> obj) throws Exception {
        
        return (List<Despesas>) getSessao().createQuery("SELECT d FROM Despesas d WHERE d.pago = false ORDER BY d.idDespesa desc").list();
    }
    
}
