/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.DespesasDAO;
import br.com.project.model.Despesas;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class DespesasBean {
    
    public void salvar(Despesas despesas){
        try {
            new DespesasDAO().saveOrUpdate(despesas);
        } catch (Exception ex) {
            Logger.getLogger(DespesasBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Despesas> getPagas(){
        try {
            return new DespesasDAO().finPagas(Despesas.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Despesas> getNPagas(){
        try {
            return new DespesasDAO().finNPagas(Despesas.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Despesas> getTodas(){
        try {
            return new DespesasDAO().finList(Despesas.class);
        } catch (Exception ex) {
            return null;
        }
    }
}
