/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eu
 * @param <T>
 */
public interface InterfaceCrud<T> extends Serializable{
    
    void saveOrUpdate(Object obj) throws Exception;
    
    void delete(T obj) throws Exception;
    
    List<T> finList(Class<T> obj) throws Exception;
    
    List<T> finList(Class<T> obj, String campo, String txt) throws Exception;
    
    Object findById(Class<T> entidade, Long id) throws Exception;
    
    Object findById(Class<T> entidade) throws Exception;
    
    List<T> findListByQueryDinamica(String query) throws Exception;
}
