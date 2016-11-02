/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Domain.Funcao;
import javax.swing.JOptionPane;
import Crud.CrudFuncao;

/**
 *
 * @author Marlon Carvalho
 */
public class IFrmExcluirFuncao extends javax.swing.JInternalFrame {
    Funcao funcao;
    /**
     * Creates new form IFrmExcluirFuncao
     */
    public IFrmExcluirFuncao(Funcao f) {
        initComponents();
        this.funcao = f;
        lbExcluirID.setText(Integer.toString(f.getId()));
        lbExcluirDesc.setText(f.getDescricao());
        lbExcluirSalario.setText(String.valueOf(f.getSalario()));
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbExcluirFuncao = new javax.swing.JButton();
        jbExcluirFuncaoCancela = new javax.swing.JButton();
        lbExcluirID = new javax.swing.JLabel();
        lbExcluirDesc = new javax.swing.JLabel();
        lbExcluirSalario = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Função");

        jLabel2.setText("ID");

        jLabel3.setText("Descrição");

        jLabel4.setText("Salário");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Deseja realmente excluir Função?");

        jbExcluirFuncao.setText("Excluir");
        jbExcluirFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirFuncaoActionPerformed(evt);
            }
        });

        jbExcluirFuncaoCancela.setText("Cancelar");
        jbExcluirFuncaoCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirFuncaoCancelaActionPerformed(evt);
            }
        });

        lbExcluirID.setText("jLabel6");

        lbExcluirDesc.setText("jLabel6");

        lbExcluirSalario.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExcluirFuncaoCancela)
                .addGap(18, 18, 18)
                .addComponent(jbExcluirFuncao)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbExcluirDesc)
                            .addComponent(lbExcluirID)
                            .addComponent(lbExcluirSalario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)))
                .addGap(66, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lbExcluirID))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbExcluirDesc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbExcluirSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluirFuncao)
                    .addComponent(jbExcluirFuncaoCancela))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirFuncaoActionPerformed
        CrudFuncao crudFuncao = new CrudFuncao();
        crudFuncao.excluirFuncao(funcao);
        JOptionPane.showMessageDialog(null, "Função Excluida!");
        this.dispose();
    }//GEN-LAST:event_jbExcluirFuncaoActionPerformed

    private void jbExcluirFuncaoCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirFuncaoCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbExcluirFuncaoCancelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbExcluirFuncao;
    private javax.swing.JButton jbExcluirFuncaoCancela;
    private javax.swing.JLabel lbExcluirDesc;
    private javax.swing.JLabel lbExcluirID;
    private javax.swing.JLabel lbExcluirSalario;
    // End of variables declaration//GEN-END:variables
}