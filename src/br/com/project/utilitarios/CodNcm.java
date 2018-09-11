/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.utilitarios;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CodNcm {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descricao_completa")
    @Expose
    private String descricaoCompleta;
    @SerializedName("capitulo")
    @Expose
    private String capitulo;
    @SerializedName("posicao")
    @Expose
    private String posicao;
    @SerializedName("subposicao1")
    @Expose
    private String subposicao1;
    @SerializedName("subposicao2")
    @Expose
    private String subposicao2;
    @SerializedName("item1")
    @Expose
    private String item1;
    @SerializedName("item2")
    @Expose
    private String item2;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getSubposicao1() {
        return subposicao1;
    }

    public void setSubposicao1(String subposicao1) {
        this.subposicao1 = subposicao1;
    }

    public String getSubposicao2() {
        return subposicao2;
    }

    public void setSubposicao2(String subposicao2) {
        this.subposicao2 = subposicao2;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("descricaoCompleta", descricaoCompleta).append("capitulo", capitulo).append("posicao", posicao).append("subposicao1", subposicao1).append("subposicao2", subposicao2).append("item1", item1).append("item2", item2).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(item2).append(descricaoCompleta).append(codigo).append(item1).append(posicao).append(subposicao1).append(subposicao2).append(capitulo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodNcm) == false) {
            return false;
        }
        CodNcm rhs = ((CodNcm) other);
        return new EqualsBuilder().append(item2, rhs.item2).append(descricaoCompleta, rhs.descricaoCompleta).append(codigo, rhs.codigo).append(item1, rhs.item1).append(posicao, rhs.posicao).append(subposicao1, rhs.subposicao1).append(subposicao2, rhs.subposicao2).append(capitulo, rhs.capitulo).isEquals();
    }
}
