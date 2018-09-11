/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.CaixaDAO;
import br.com.project.model.Caixadodia;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class CaixaBean {
    public void salvar(Caixadodia caixadodia){
        try {
            new CaixaDAO().saveOrUpdate(caixadodia);
        } catch (Exception ex) {
            Logger.getLogger(CaixaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Double pegaCaixa(){
        try {
            return (Double) new CaixaDAO().findCaixa();
        } catch (Exception ex) {
            return 0.0;
        }
    }
}
