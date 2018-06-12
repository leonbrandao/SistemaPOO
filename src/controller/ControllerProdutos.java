/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Leon
 */
public class ControllerProdutos {

    private DaoProdutos daoProdutos = new DaoProdutos();

    /**
     * salvar produtos no controller
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutoColtroller(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);

    }

    /**
     * excluir um produto pelo codigo
     *
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutosController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);

    }

    /**
     * alterar um produto
     *
     * @param pModelProdutos
     * @return
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    /**
     * retornar um produto pelo codigo
     * @param pCodigo
     * @return model produto
     */
    public ModelProdutos retorarProdutoController(int pCodigo) {
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    /**
     * retornar lista de produtos
     * @return lista de produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutos(){
        return this.daoProdutos.retornarListaProdutosDAO();
        
    }
}
