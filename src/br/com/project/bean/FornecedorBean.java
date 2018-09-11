/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.FornecedorDAO;
import br.com.project.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class FornecedorBean {
    
    public void salvar(Fornecedor fornecedor){
        try {
            new FornecedorDAO().saveOrUpdate(fornecedor);
        } catch (Exception ex) {
            Logger.getLogger(FornecedorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Fornecedor> listFornecedor(){
        try {
            return new FornecedorDAO().finList(Fornecedor.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Fornecedor> listFornecedor(String txt){
        try {
            return new FornecedorDAO().finList(Fornecedor.class, "razaoSocial", "nomeFantasia", txt);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
