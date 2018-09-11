/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.project.model.Produtos;
import br.com.framework.implementacao.crud.ImplementacaoCrud;
import java.util.List;

/**
 *
 * @author Eu
 */
public class ProdutosDAO extends ImplementacaoCrud<Produtos>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produtos> finList(Class<Produtos> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produtos> finList(Class<Produtos> obj, String campo, String txt) throws Exception {
        return super.finList(obj, campo, txt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Produtos obj) throws Exception {
        super.delete(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Produtos> findQuery(String query, String parametro, String txt) throws Exception{
        return super.getSessao().getNamedQuery(query).setParameter(parametro, txt).list();
    }
}
