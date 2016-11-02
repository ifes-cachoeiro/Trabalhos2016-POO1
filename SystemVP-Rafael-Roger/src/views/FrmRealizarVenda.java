/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import crud.VendaCRUD;
import database.Database;
import static database.Database.lstClientes;
import static database.Database.lstProdutos;
import domain.Cliente;
import domain.Produto;
import domain.Venda;
import javax.swing.JOptionPane;

/**
 *
 * @author rafaelrocha
 */
public class FrmRealizarVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRealizarVenda
     */
    Venda venda = new Venda();
    //private Iterable<Integer> quantidade;
    
    public FrmRealizarVenda() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCpfCliente = new javax.swing.JTextField();
        btBuscarCliente = new javax.swing.JButton();
        jNomeCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfQtdProdutos = new javax.swing.JTextField();
        btAdicionarProduto = new javax.swing.JButton();
        btFinalizarVenda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realizar Vendas");
        setToolTipText("");
        setVisible(true);

        jLabel1.setText("Realizar venda do Cliente:");

        jLabel2.setText("CPF do Cliente:");

        btBuscarCliente.setText("Buscar");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("ID do Produto:");

        jLabel4.setText("Qtd de Produtos:");

        btAdicionarProduto.setText("Adicionar");
        btAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarProdutoActionPerformed(evt);
            }
        });

        btFinalizarVenda.setText("Finalizar Venda");
        btFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btBuscarCliente))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAdicionarProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdProduto)
                                    .addComponent(tfQtdProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                            .addComponent(btFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQtdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAdicionarProduto)
                .addGap(18, 18, 18)
                .addComponent(btFinalizarVenda)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        //Venda venda = new Venda();
        
        String cpfAux = tfCpfCliente.getText();
        
        for(Cliente x: lstClientes){
            if(x.getCpf().contains(cpfAux)){
               venda.cliente = x; 
            }
        }
        jNomeCliente.setText(venda.cliente.getNomeCompleto());
    }//GEN-LAST:event_btBuscarClienteActionPerformed

    private void btAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarProdutoActionPerformed
        
        
        while(true){
            if(venda.cliente.getNomeCompleto() != null){
                Integer idAux = Integer.parseInt(tfIdProduto.getText());
                Integer quantidade = Integer.parseInt(tfQtdProdutos.getText());
            
                for(Produto p: lstProdutos){
                    if(p.getId() == idAux){
                        p.qtd = quantidade;
                        venda.lstProdutos.add(p);
                    }
                }
                JOptionPane.showMessageDialog(null, "Produto incluido com sucesso");
                this.tfIdProduto.setText(null);
                this.tfQtdProdutos.setText(null);
                this.tfIdProduto.requestFocusInWindow();
                
            }
            
               
        }
        
           
    }//GEN-LAST:event_btAdicionarProdutoActionPerformed

    private void btFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarVendaActionPerformed
        if(venda.cliente.getNomeCompleto() != null){
            venda.fechada = false;
            venda.setId(Venda.nextID);
            VendaCRUD vendaCrud = new VendaCRUD();
            vendaCrud.inserir(venda);
            JOptionPane.showMessageDialog(null, "Venda Cadastrada!");
            this.dispose();   
        }
    }//GEN-LAST:event_btFinalizarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarProduto;
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jNomeCliente;
    private javax.swing.JTextField tfCpfCliente;
    private javax.swing.JTextField tfIdProduto;
    private javax.swing.JTextField tfQtdProdutos;
    // End of variables declaration//GEN-END:variables
}
