/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.bean;

import br.com.project.dao.PedidosDAO;
import br.com.project.model.Pedidos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eu
 */
public class PedidosBean {

    public void salvar(Pedidos pedidos) {
        try {
            new PedidosDAO().saveOrUpdate(pedidos);
        } catch (Exception ex) {
            Logger.getLogger(PedidosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Pedidos> listPedidos() {
        try {
            return new PedidosDAO().finList(Pedidos.class);
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }

    public Integer proximaId() {
        try {
            return (Integer) new PedidosDAO().findQueryDinamica("SELECT MAX(p.idPedido) FROM Pedidos p") + 1;
        } catch (Exception ex) {
            return 1;
        }
    }

    public List<Pedidos> listPedidosUser() {
        try {
            return new PedidosDAO().findListByNamedQueryDinamica("Pedidos.findByAprovacao");
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }

    public List<Pedidos> listPedidosMes() {
        try {
            return new PedidosDAO().findListByQueryDinamica("SELECT p FROM Pedidos p WHERE MONTH(p.dataPedido) = MONTH(" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ")");
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
