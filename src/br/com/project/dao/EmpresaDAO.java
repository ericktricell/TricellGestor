/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Empresa;

/**
 *
 * @author Eu
 */
public class EmpresaDAO extends ImplementacaoCrud<Empresa>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findById(Class<Empresa> entidade) throws Exception {
        return super.findById(entidade); //To change body of generated methods, choose Tools | Templates.
    }
    
}
