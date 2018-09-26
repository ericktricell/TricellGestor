/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.ComprasDAO;
import br.com.project.model.Compras;
import javax.swing.JOptionPane;

/**
 *
 * @author Eu
 */
public class ComprasBean {
    
    public void salvar(Compras compras){
        try {
            new ComprasDAO().saveOrUpdate(compras);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (Exception ex) {
            
        }
    }
    
    public Integer proximoId(){
        try {
            return (Integer) new ComprasDAO().findNamedQueryDinamica("Compras.findAll") + 1;
        } catch (Exception ex) {
            return 1;
        }
    }
}
