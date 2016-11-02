/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import domain.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
 public class ClienteTableModel extends AbstractTableModel{
        
        private ArrayList<Cliente> linhas;
        
        public ClienteTableModel(){
            linhas = new ArrayList<Cliente>();
        }
        
        public ClienteTableModel(ArrayList<Cliente> lstCliente){
            linhas = new ArrayList<Cliente>(lstCliente);
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
            Cliente cliente = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    return cliente.getCod_cliente();
                case NOME:
                    return cliente.getNome_cliente();
                case ENDERECO:
                    return cliente.getRua_cliente();
                case CIDADE:
                    return cliente.getCidade_cliente();
                case TELEFONE:
                    return cliente.getTelefone1_cliente();
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
        
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex){
            Cliente cliente = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    cliente.setCod_cliente((int) aValue);
                    break;
                case NOME:
                    cliente.setNome_cliente((String) aValue);
                    break;
                case ENDERECO:
                    cliente.setRua_cliente((String) aValue);
                    break;
                case CIDADE:
                    cliente.setCidade_cliente((String) aValue);
                    break;
                case TELEFONE:
                    cliente.setTelefone1_cliente((String) aValue);
                    break;
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        }
        
        public Cliente getCliente(int indiceLinha){
            return linhas.get(indiceLinha);
        }
        
        public void addCliente(Cliente cliente){
            linhas.add(cliente);
            int ultimoIndice = getRowCount() - 1;
            fireTableRowsInserted(ultimoIndice, ultimoIndice);
        }
        
        public void removeCliente(int indiceLinha){
            linhas.remove(indiceLinha);
            fireTableRowsDeleted(indiceLinha, indiceLinha);
        }
        
        public void limpar(){
            linhas.clear();
            fireTableDataChanged();
        }
    }
