/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.ProdutosDAO;
import br.com.project.model.Produtos;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class ProdutosBean {
    
    public void salvar(Produtos produtos){
        try {
            new ProdutosDAO().saveOrUpdate(produtos);
        } catch (Exception ex) {
            Logger.getLogger(ProdutosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Produtos produtos){
        try {
            new ProdutosDAO().delete(produtos);
        } catch (Exception ex) {
            Logger.getLogger(ProdutosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Produtos> listProdutos(){
        try {
            return new ProdutosDAO().finList(Produtos.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Produtos> listProdutos(String campo, String txt){
        try {
            return new ProdutosDAO().finList(Produtos.class, campo, txt);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public List<Produtos> listProdutos(String txt){
        try {
            return new ProdutosDAO().findQuery("Produtos.findByNome", "nome", "%" +txt+"%");
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
