/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */

import Domain.Cliente;
import Domain.Entrega;
import Domain.Funcao;
import Domain.Funcionario;
import Domain.Produto;
import Domain.Usuario;
import Domain.Venda;
import java.util.ArrayList;

public class database {
    
    public static ArrayList<Cliente> lstCliente = new ArrayList<>();
    public static ArrayList<Entrega> lstEntrega = new ArrayList<>();
    public static ArrayList<Funcao> lstFuncao = new ArrayList<>();
    public static ArrayList<Funcionario> lstFuncionario = new ArrayList<>();
    public static ArrayList<Produto> lstProduto = new ArrayList<>();
    public static ArrayList<Usuario> lstUsuario = new ArrayList<>();
    public static ArrayList<Venda> lstVenda = new ArrayList<>();
}
