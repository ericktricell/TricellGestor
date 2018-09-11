/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Pedidos;
import java.util.List;

/**
 *
 * @author Eu
 */
public class PedidosDAO extends ImplementacaoCrud<Pedidos>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedidos> finList(Class<Pedidos> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findQueryDinamica(String txt) throws Exception {
        return super.findQueryDinamica(txt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedidos> findListByQueryDinamica(String query) throws Exception {
        return super.findListByQueryDinamica(query); //To change body of generated methods, choose Tools | Templates.
    }
    
}
