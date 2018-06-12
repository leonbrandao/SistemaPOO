/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 * @author Leon
 */
public class ModelProdutos {
    
    private int idPrduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;

    /**
     * @return the idPrduto
     */
    public int getIdPrduto() {
        return idPrduto;
    }

    /**
     * @param idPrduto the idPrduto to set
     */
    public void setIdPrduto(int idPrduto) {
        this.idPrduto = idPrduto;
    }

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    /**
     * @return the proValor
     */
    public Double getProValor() {
        return proValor;
    }

    /**
     * @param proValor the proValor to set
     */
    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    /**
     * @return the proEstoque
     */
    public int getProEstoque() {
        return proEstoque;
    }

    /**
     * @param proEstoque the proEstoque to set
     */
    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }
    
}
