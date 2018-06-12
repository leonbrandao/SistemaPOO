/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;
import java.util.ArrayList;

/**
 * CADASTRAR UM PRODUTO NO BANCO
 *
 * @author Leon
 */
public class DaoProdutos extends ConexaoMySql {

    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {

        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto ("
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_estoque "
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProNome() + "',"
                    + "'" + pModelProdutos.getProValor() + "',"
                    + "'" + pModelProdutos.getProEstoque() + "'"
                    + " );"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * EXCLUIR UM PRODUTO DO BANCO
     *
     * @param pIdProduto
     * @return
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * ALTERAR DADOS DE UM PRODUTO DO BANCO
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pro_nome = '" + pModelProdutos.getProNome() + "',"
                    + "pro_valor = '" + pModelProdutos.getProValor() + "',"
                    + "pro_estoque = '" + pModelProdutos.getProEstoque() + "'"
                    + " WHERE pk_id_produto = '" + pModelProdutos.getIdPrduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * retornar um produto pelo codigo
     *
     * @param pIdProduto
     * @return
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_estoque "
                    + "FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setIdPrduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * retornar uma lista completa de produtos
     *
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_estoque  "
                    + "FROM tbl_produto;");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdPrduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
}
