/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erick
 */
@Entity
@Table(name = "produtos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p ORDER BY p.inativo desc"),
    @NamedQuery(name = "Produtos.findByIdProduto", query = "SELECT p FROM Produtos p WHERE p.idProduto = :idProduto"),
    @NamedQuery(name = "Produtos.findByNome", query = "SELECT p FROM Produtos p WHERE p.nome like :nome and p.inativo = false"),
    @NamedQuery(name = "Produtos.reajuste", query = "UPDATE Produtos p SET p.valorVenda = :venda WHERE p.idProduto = :id"),
    @NamedQuery(name = "Produtos.somaC", query = "SELECT p FROM Produtos p WHERE p.inativo = false")
    })
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProduto")
    private Integer idProduto;
    
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "descricao")
    private String descricao;
    
// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantidade")
    private Double quantidade;
    
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    
    @Basic(optional = false)
    @Column(name = "valorVenda")
    private double valorVenda;
    
    @Basic(optional = false)
    @Column(name = "valorCompra")
    private double valorCompra;
    
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    
    @Column(name = "inativo")
    private boolean inativo;
    
    @Column(name = "codigo", length = 30)
    private String codigo;

    @Column(name = "codNcm", length = 10)
    private String codNcm;
    
    @Column(name = "medida", length = 2)
    private String medida;

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public Produtos() {
    }

    public Produtos(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
}