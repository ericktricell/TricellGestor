/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Departamento;
import java.util.List;

/**
 *
 * @author Eu
 */
public class DepartamentoDAO extends ImplementacaoCrud<Departamento>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> finList(Class<Departamento> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> finList(Class<Departamento> obj, String campo, String txt) throws Exception {
        return super.finList(obj, campo, txt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Departamento obj) throws Exception {
        super.delete(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
}
