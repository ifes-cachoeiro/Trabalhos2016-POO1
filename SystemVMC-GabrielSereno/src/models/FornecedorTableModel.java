/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;


import domain.Fornecedor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
 public class FornecedorTableModel extends AbstractTableModel{
        
        private ArrayList<Fornecedor> linhas;
        
        public FornecedorTableModel(){
            linhas = new ArrayList<Fornecedor>();
        }
        
        public FornecedorTableModel(ArrayList<Fornecedor> lstFornecedor){
            linhas = new ArrayList<Fornecedor>(lstFornecedor);
        }
        
        private String[] colunas = new String[] {"Código", "Nome", "Endereço", "Cidade", "Telefone #1"};
        
        private static final int CODIGO = 0;
        private static final int NOME = 1;
        private static final int ENDERECO = 2;
        private static final int CIDADE = 3;
        private static final int TELEFONE = 4;
        
        @Override
        public int getRowCount(){
            return linhas.size();
        }
        
        @Override
        public int getColumnCount(){
            return colunas.length;
        }
        
        @Override
        public String getColumnName(int columnIndex){
            return colunas[columnIndex];
        }
        
        @Override
        public Class<?> getColumnClass(int columnIndex){
            switch(columnIndex){
                case CODIGO:
                    return String.class;
                case NOME:
                    return String.class;
                case ENDERECO:
                    return String.class;
                case CIDADE:
                    return String.class;
                case TELEFONE:
                    return String.class;
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
        
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex){
            return false;
        }
        
        @Override
        public Object getValueAt(int rowIndex, int columnIndex){
            Fornecedor fornecedor = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    return fornecedor.getCod_fornecedor();
                case NOME:
                    return fornecedor.getNome_fornecedor();
                case ENDERECO:
                    return fornecedor.getEndereco_fornecedor();
                case CIDADE:
                    return fornecedor.getCidade_fornecedor();
                case TELEFONE:
                    return fornecedor.getTelefone1_fornecedor();
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
        
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex){
            Fornecedor fornecedor = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    fornecedor.setCod_fornecedor((int) aValue);
                    break;
                case NOME:
                    fornecedor.setNome_fornecedor((String) aValue);
                    break;
                case ENDERECO:
                    fornecedor.setEndereco_fornecedor((String) aValue);
                    break;
                case CIDADE:
                    fornecedor.setCidade_fornecedor((String) aValue);
                    break;
                case TELEFONE:
                    fornecedor.setTelefone1_fornecedor((String) aValue);
                    break;
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        }
        
        public Fornecedor getFornecedor(int indiceLinha){
            return linhas.get(indiceLinha);
        }
        
        public void addCliente(Fornecedor fornecedor){
            linhas.add(fornecedor);
            int ultimoIndice = getRowCount() - 1;
            fireTableRowsInserted(ultimoIndice, ultimoIndice);
        }
        
        public void removeFornecedor(int indiceLinha){
            linhas.remove(indiceLinha);
            fireTableRowsDeleted(indiceLinha, indiceLinha);
        }
        
        public void limpar(){
            linhas.clear();
            fireTableDataChanged();
        }
    }
