/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.UsuarioDAO;
import br.com.project.model.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class UsuarioBean {
    
    public void salvar(Usuario usuario){
        try {
            new UsuarioDAO().saveOrUpdate(usuario);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Usuario> listUsuario(){
        try {
            return new UsuarioDAO().finList(Usuario.class);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public Usuario validaAcesso(String login, String senha){
        try {
           return (Usuario) new UsuarioDAO().find(login, senha);
        } catch (Exception ex) {
            return null;
        }
    }
}
