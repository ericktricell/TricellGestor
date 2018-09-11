/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.dao;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.project.model.Usuario;
import java.util.List;

/**
 *
 * @author Eu
 */
public class UsuarioDAO extends ImplementacaoCrud<Usuario>{

    @Override
    public void saveOrUpdate(Object obj) throws Exception {
        super.saveOrUpdate(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> finList(Class<Usuario> obj) throws Exception {
        return super.finList(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public Object find(String login, String senha) throws Exception {
        return super.getSessao().getNamedQuery("Usuario.findBySenha").setParameter("senha", senha)
                .setParameter("cod", login).uniqueResult();
    }
    
    
}
