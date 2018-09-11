/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Compras;
import java.util.List;

/**
 *
 * @author Eu
 */
public class ComprasDAO extends ImplementacaoCrud<Compras>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compras> finList(Class<Compras> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findNamedQueryDinamica(String txt) throws Exception {
        return super.findNamedQueryDinamica(txt); //To change body of generated methods, choose Tools | Templates.
    }

}
