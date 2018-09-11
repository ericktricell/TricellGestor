/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Fornecedor;
import java.util.List;

/**
 *
 * @author Eu
 */
public class FornecedorDAO extends ImplementacaoCrud<Fornecedor>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> finList(Class<Fornecedor> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> finList(Class<Fornecedor> obj, String campo1, String campo2, String txt) throws Exception {
        return super.finList(obj, campo1, campo2, txt); //To change body of generated methods, choose Tools | Templates.
    }
}
