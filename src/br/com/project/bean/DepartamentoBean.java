/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.DepartamentoDAO;
import br.com.project.model.Departamento;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eu
 */
public class DepartamentoBean {
    
    public void salvar(Departamento departamento){
        try {
            new DepartamentoDAO().saveOrUpdate(departamento);
        } catch (Exception ex) {
            Logger.getLogger(DepartamentoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Departamento departamento){
        try {
            new DepartamentoDAO().delete(departamento);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Departamento não pode ser excluido \n há funcionários cadastro no mesmo", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public List<Departamento> listDep(String txt){
        try {
            return new DepartamentoDAO().finList(Departamento.class, "nomeDpto", txt);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public List<Departamento> listDep(){
        try {
            return new DepartamentoDAO().finList(Departamento.class);
        } catch (Exception ex) {
            return null;
        }
    }
}
