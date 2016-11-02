/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import domain.Venda;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
 public class VendaTableModel extends AbstractTableModel{
        
        private ArrayList<Venda> linhas;
        
        public VendaTableModel(){
            linhas = new ArrayList<Venda>();
        }
        
        public VendaTableModel(ArrayList<Venda> lstVenda){
            linhas = new ArrayList<Venda>(lstVenda);
        }
        
        private String[] colunas = new String[] {"Código", "Nome", "Endereço", "Cidade", "Telefone #1", "Data", "Hora"};
        
        private static final int CODIGO = 0;
        private static final int NOME = 1;
        private static final int ENDERECO = 2;
        private static final int CIDADE = 3;
        private static final int TELEFONE = 4;
        private static final int DATA = 5;
        private static final int HORA = 6;

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
                case DATA:
                    return String.class;
                case HORA:
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
            Venda venda = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    return venda.getCod_venda();
                case NOME:
                    return venda.getCliente().getNome_cliente();
                case ENDERECO:
                    return venda.getCliente().getRua_cliente();
                case CIDADE:
                    return venda.getCliente().getCidade_cliente();
                case TELEFONE:
                    return venda.getCliente().getTelefone1_cliente();
                case DATA:
                    return venda.getData_venda();
                case HORA:
                    return venda.getHora_venda();
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
        
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex){
            Venda venda = linhas.get(rowIndex);
            
            switch (columnIndex){
                case CODIGO:
                    venda.setCod_venda((int) aValue);
                    break;
                case NOME:
                    venda.getCliente().setNome_cliente((String) aValue);
                    break;
                case ENDERECO:
                    venda.getCliente().setRua_cliente((String) aValue);
                    break;
                case CIDADE:
                    venda.getCliente().setCidade_cliente((String) aValue);
                    break;
                case TELEFONE:
                    venda.getCliente().setTelefone1_cliente((String) aValue);
                case DATA:
                    venda.setData_venda((String) aValue);
                    break;
                case HORA:
                    venda.setHora_venda((String) aValue);
                default:
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        }
        
        public Venda getVenda(int indiceLinha){
            return linhas.get(indiceLinha);
        }
        
        public void addVenda(Venda venda){
            linhas.add(venda);
            int ultimoIndice = getRowCount() - 1;
            fireTableRowsInserted(ultimoIndice, ultimoIndice);
        }
        
        public void removeVenda(int indiceLinha){
            linhas.remove(indiceLinha);
            fireTableRowsDeleted(indiceLinha, indiceLinha);
        }
        
        public void limpar(){
            linhas.clear();
            fireTableDataChanged();
        }
    }
