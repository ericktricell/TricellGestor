/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.CategoriaDAO;
import br.com.project.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class CategoriaBean {
    public void salvar(Categoria categoria){
        try {
            new CategoriaDAO().saveOrUpdate(categoria);
        } catch (Exception ex) {
            Logger.getLogger(CategoriaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Categoria> listaCategorias(){
        try {
            return new CategoriaDAO().finList(Categoria.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Categoria> listaCategorias(String txt){
        try {
            return new CategoriaDAO().finList(Categoria.class, "categoria", txt);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
