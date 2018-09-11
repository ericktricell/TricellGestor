/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.FuncionarioDAO;
import br.com.project.model.Funcionario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class FuncionarioBean {
    
    public void salvar(Funcionario funcionario){
        try {
            new FuncionarioDAO().saveOrUpdate(funcionario);
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Funcionario> listFunc(){
        try {
            return new FuncionarioDAO().finList(Funcionario.class);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public List<Funcionario> listFunc(String txt){
        try {
            return new FuncionarioDAO().finList(Funcionario.class, "nome", txt);
        } catch (Exception ex) {
            return null;
        }
    }
}
