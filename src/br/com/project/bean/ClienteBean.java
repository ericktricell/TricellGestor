/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.ClienteDAO;
import br.com.project.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class ClienteBean {
    public void salvar(Cliente cliente){
        try {
            new ClienteDAO().saveOrUpdate(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ClienteBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> listCliente(){
        try {
            return new ClienteDAO().finList(Cliente.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Cliente> listCliente(String txt){
        try {
            return new ClienteDAO().finList(Cliente.class, "nome", txt);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
