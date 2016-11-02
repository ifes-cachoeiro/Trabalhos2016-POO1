/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import domain.Cliente;
import domain.Fornecedor;
import domain.Produto;
import domain.Usuario;
import domain.Venda;
import java.util.ArrayList;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class database {
    public static ArrayList<Cliente> lstCliente = new ArrayList<>();
    public static ArrayList<Fornecedor> lstFornecedor = new ArrayList<>();
    public static ArrayList<Produto> lstProduto = new ArrayList<>();
    public static ArrayList<Produto> lstProdutoAdicionado = new ArrayList <>();
    public static ArrayList<Venda> lstVenda = new ArrayList<>();
    public static ArrayList<Usuario> lstUsuario = new ArrayList <>();
    
    public static void iniciarBanco() throws Exception{
           Cliente cliente = new Cliente();
    cliente.setBairro_cliente("IBC");
    cliente.setCidade_cliente("Cachoeiro");
    cliente.setCod_cliente(0);
    cliente.setComplemento_cliente("Quadra");
    cliente.setCpf_cliente("12312312");
    cliente.setNome_cliente("Gabriel Sereno");
    cliente.setNumero_cliente("13");
    cliente.setRua_cliente("Rua da Rua");
    cliente.setTelefone1_cliente("35174233");
    cliente.setTelefone2_cliente("Paranaué");
    cliente.setUf_cliente("ES");
    lstCliente.add(cliente);
    
    Fornecedor fornecedor = new Fornecedor();
    fornecedor.setBairro_fornecedor("Monte Cristo");
    fornecedor.setCEP_fornecedor("3123123");
    fornecedor.setCidade_fornecedor("Cachoeiro de Itapemirim");
    fornecedor.setCnpj_fornecedor("3213123");
    fornecedor.setCod_fornecedor(0);
    fornecedor.setEmail_fornecedor("ronaldo@hotmail.com");
    fornecedor.setEndereco_fornecedor("Papalindo");
    fornecedor.setNome_fornecedor("Tesoura Móveis");
    fornecedor.setNumero_fornecedor("49");
    fornecedor.setTelefone1_fornecedor("12i12i31123");
    fornecedor.setTelefone2_fornecedor("1231231231");
    fornecedor.setUf_fornecedor("ES");
    lstFornecedor.add(fornecedor);
    
    Produto produto = new Produto();
    produto.setCod_produto(0);
    produto.setEstoque_produto(999);
    produto.setFornecedor_produto(fornecedor);
    produto.setMarca_produto("Tigre");
    produto.setMinestoque_produto(1);
    produto.setModelo_produto("Curto");
    produto.setNome_produto("Cano Curto da Tigre");
    produto.setPccomissao_produto("10%");
    produto.setPrecocompra_produto(10.0);
    produto.setPrecovenda_produto(25.5);
    produto.setUnidade_produto("Qtd");
    lstProduto.add(produto);
    }
}
