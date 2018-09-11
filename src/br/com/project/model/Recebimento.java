/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Erick
 */
@Entity
@Table(name = "recebimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recebimento.findAll", query = "SELECT r FROM Recebimento r")
})
public class Recebimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRecebimento")
    private Integer idRecebimento;
    
    @Column(name = "natureza_operacao")
    private String natureza_operacao;
    
    @Column(name = "forma_pagamento")
    private String forma_pagamento;
    
    @Column(name = "data_emissao")
    private String data_emissao;
    
    @Column(name = "tipo_documento")
    private String tipo_documento;
    
    @Column(name = "local_destino")
    private String local_destino;
    
    @Column(name = "finalidade_emissao")
    private String finalidade_emissao;
    
    @Column(name = "consumidor_final")
    private String consumidor_final;
    
    @Column(name = "presenca_comprador")
    private String presenca_comprador;
    
    @Column(name = "valor_frete")
    private String valor_frete;
    
    @Column(name = "valor_seguro")
    private String valor_seguro;
    
    @Column(name = "valor_produtos")
    private String valor_produtos;
    
    @Column(name = "valor_total")
    private String valor_total;
    
    @Column(name = "modalidade_frete")
    private String modalidade_frete;
    
    @JoinColumn(name = "emitente", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private Empresa emitente;
    
    @JoinColumn(name = "vendedor", referencedColumnName = "idFuncionario")
    @ManyToOne(optional = false)
    private Funcionario vendedor;
    
    @JoinColumn(name = "idCaixa", referencedColumnName = "idCaixa")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Caixadodia idCaixa;
    
    @JoinColumn(name = "destinatario", referencedColumnName = "idCliente")
    @ManyToOne(cascade = CascadeType.ALL, optional = true)
    private Cliente destinatario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recebimento")
    private List<Vendaproduto> vendaprodutoList;

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(Integer idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public String getNatureza_operacao() {
        return natureza_operacao;
    }

    public void setNatureza_operacao(String natureza_operacao) {
        this.natureza_operacao = natureza_operacao;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getLocal_destino() {
        return local_destino;
    }

    public void setLocal_destino(String local_destino) {
        this.local_destino = local_destino;
    }

    public String getFinalidade_emissao() {
        return finalidade_emissao;
    }

    public void setFinalidade_emissao(String finalidade_emissao) {
        this.finalidade_emissao = finalidade_emissao;
    }

    public String getConsumidor_final() {
        return consumidor_final;
    }

    public void setConsumidor_final(String consumidor_final) {
        this.consumidor_final = consumidor_final;
    }

    public String getPresenca_comprador() {
        return presenca_comprador;
    }

    public void setPresenca_comprador(String presenca_comprador) {
        this.presenca_comprador = presenca_comprador;
    }

    public String getValor_frete() {
        return valor_frete;
    }

    public void setValor_frete(String valor_frete) {
        this.valor_frete = valor_frete;
    }

    public String getValor_seguro() {
        return valor_seguro;
    }

    public void setValor_seguro(String valor_seguro) {
        this.valor_seguro = valor_seguro;
    }

    public String getValor_produtos() {
        return valor_produtos;
    }

    public void setValor_produtos(String valor_produtos) {
        this.valor_produtos = valor_produtos;
    }

    public String getValor_total() {
        return valor_total;
    }

    public void setValor_total(String valor_total) {
        this.valor_total = valor_total;
    }

    public String getModalidade_frete() {
        return modalidade_frete;
    }

    public void setModalidade_frete(String modalidade_frete) {
        this.modalidade_frete = modalidade_frete;
    }

    public Empresa getEmitente() {
        return emitente;
    }

    public void setEmitente(Empresa emitente) {
        this.emitente = emitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    @XmlTransient
    public Caixadodia getCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Caixadodia idCaixadodia) {
        this.idCaixa = idCaixadodia;
    }

    @XmlTransient
    public List<Vendaproduto> getVendaprodutoList() {
        return vendaprodutoList;
    }

    public void setVendaprodutoList(List<Vendaproduto> vendaprodutoList) {
        this.vendaprodutoList = vendaprodutoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecebimento != null ? idRecebimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recebimento)) {
            return false;
        }
        Recebimento other = (Recebimento) object;
        if ((this.idRecebimento == null && other.idRecebimento != null) || (this.idRecebimento != null && !this.idRecebimento.equals(other.idRecebimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.eagestor.domain.Recebimento[ idRecebimento=" + idRecebimento + " ]";
    }
    
}
