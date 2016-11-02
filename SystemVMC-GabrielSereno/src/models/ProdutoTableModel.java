/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import domain.Produto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class ProdutoTableModel extends AbstractTableModel {

    private ArrayList<Produto> linhas;

    public ProdutoTableModel() {
        linhas = new ArrayList<Produto>();
    }

    public ProdutoTableModel(ArrayList<Produto> lstProduto) {
        linhas = new ArrayList<Produto>(lstProduto);
    }

    private String[] colunas = new String[]{"Código", "Nome", "Marca", "Modelo", "Preço Venda", "Estoque", "Unidade"};

    private static final int CODIGO = 0;
    private static final int NOME = 1;
    private static final int MARCA = 2;
    private static final int MODELO = 3;
    private static final int PRECOVENDA = 4;
    private static final int ESTOQUE = 5;
    private static final int UNIDADE = 6;

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case CODIGO:
                return String.class;
            case NOME:
                return String.class;
            case MARCA:
                return String.class;
            case MODELO:
                return String.class;
            case PRECOVENDA:
                return String.class;
            case ESTOQUE:
                return String.class;
            case UNIDADE:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                return produto.getCod_produto();
            case NOME:
                return produto.getNome_produto();
            case MARCA:
                return produto.getMarca_produto();
            case MODELO:
                return produto.getModelo_produto();
            case PRECOVENDA:
                return produto.getPrecocompra_produto();
            case ESTOQUE:
                return produto.getEstoque_produto();
            case UNIDADE:
                return produto.getUnidade_produto();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                produto.setCod_produto((int) aValue);
                break;
            case NOME:
                produto.setNome_produto((String) aValue);
                break;
            case MARCA:
                produto.setMarca_produto((String) aValue);
                break;
            case MODELO:
                produto.setModelo_produto((String) aValue);
                break;
            case PRECOVENDA:
                try {
                    produto.setPrecovenda_produto((double) aValue);
                } catch (Exception ex) {
                    Logger.getLogger(ProdutoTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case ESTOQUE:
                try {
                    produto.setEstoque_produto((int) aValue);
                } catch (Exception ex) {
                    Logger.getLogger(ProdutoTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case UNIDADE:
                produto.setUnidade_produto((String) aValue);
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Produto getProduto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void addProduto(Produto produto) {
        linhas.add(produto);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeProduto(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
}
