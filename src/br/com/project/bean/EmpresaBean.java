/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.EmpresaDAO;
import br.com.project.model.Empresa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eu
 */
public class EmpresaBean {
    
    public Empresa getEmpresa(){
        Empresa empresa = null;
        try {
            empresa = (Empresa) new EmpresaDAO().findById(Empresa.class);
        } catch (Exception ex) {
            Logger.getLogger(EmpresaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return empresa;
    }
    
    public void salva(Empresa empresa){
        try {
            new EmpresaDAO().saveOrUpdate(empresa);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Sucesso", JOptionPane.OK_OPTION);
        } catch (Exception ex) {
            Logger.getLogger(EmpresaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
