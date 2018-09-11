/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Caixadodia;
import java.util.Date;

/**
 *
 * @author Eu
 */
public class CaixaDAO extends ImplementacaoCrud<Caixadodia>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findQueryDinamica(String txt) throws Exception {
        return super.findQueryDinamica(txt); //To change body of generated methods, choose Tools | Templates.
    }

    public Object findCaixa() throws Exception{
        return getSessao().getNamedQuery("Caixadodia.findByData").setParameter("data", new Date()).uniqueResult();
    }
}
