/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Lamon's House
 */
public class JFrmTurma extends javax.swing.JFrame {

    /**
     * Creates new form JFrmTurma
     */
    public JFrmTurma() {
        initComponents();
        btExcluirTurma.setOpaque(false);
        btExcluirTurma.setContentAreaFilled(false);
        btExcluirTurma.setBorderPainted(false);
        btAddTurma.setOpaque(false);
        btAddTurma.setContentAreaFilled(false);
        btAddTurma.setBorderPainted(false);
        btAlterarTurma.setOpaque(false);
        btAlterarTurma.setContentAreaFilled(false);
        btAlterarTurma.setBorderPainted(false);
        btListarTurmas.setOpaque(false);
        btListarTurmas.setContentAreaFilled(false);
        btListarTurmas.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAddTurma = new javax.swing.JButton();
        btExcluirTurma = new javax.swing.JButton();
        btAlterarTurma = new javax.swing.JButton();
        btListarTurmas = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        btAddTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/add TUrma.png"))); // NOI18N
        btAddTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAddTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAddTurmaMouseEntered(evt);
            }
        });
        btAddTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddTurmaActionPerformed(evt);
            }
        });

        btExcluirTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ExcluirTurma.png"))); // NOI18N
        btExcluirTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btExcluirTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExcluirTurmaMouseEntered(evt);
            }
        });
        btExcluirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirTurmaActionPerformed(evt);
            }
        });

        btAlterarTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/TurmaAtualiza.png"))); // NOI18N
        btAlterarTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAlterarTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAlterarTurmaMouseEntered(evt);
            }
        });
        btAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarTurmaActionPerformed(evt);
            }
        });

        btListarTurmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ListarTurma.png"))); // NOI18N
        btListarTurmas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btListarTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btListarTurmasMouseEntered(evt);
            }
        });
        btListarTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTurmasActionPerformed(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Voltar.png"))); // NOI18N
        btVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVoltarMouseEntered(evt);
            }
        });
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Adicionar Turma");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Excluir Turma");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Alterar Turma");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Listar Turmas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btAddTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(btAlterarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(115, 115, 115)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btExcluirTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btListarTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addComponent(jLabel2))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAlterarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btListarTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAlterarTurma at = new JFrmAlterarTurma();
        at.setVisible(true);
    }//GEN-LAST:event_btAlterarTurmaActionPerformed

    private void btListarTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTurmasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmListarTurma lc = new JFrmListarTurma();
        lc.setVisible(true);
    }//GEN-LAST:event_btListarTurmasActionPerformed

    private void btAddTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAddTurma addt = new JFrmAddTurma();
        addt.setVisible(true);

    }//GEN-LAST:event_btAddTurmaActionPerformed

    private void btExcluirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmExcluirTurma et = new JFrmExcluirTurma();
        et.setVisible(true);
    }//GEN-LAST:event_btExcluirTurmaActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmMenu m = new JFrmMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        btExcluirTurma.setOpaque(false);
        btExcluirTurma.setContentAreaFilled(false);
        btExcluirTurma.setBorderPainted(false);
        btAddTurma.setOpaque(false);
        btAddTurma.setContentAreaFilled(false);
        btAddTurma.setBorderPainted(false);
        btAlterarTurma.setOpaque(false);
        btAlterarTurma.setContentAreaFilled(false);
        btAlterarTurma.setBorderPainted(false);
        btListarTurmas.setOpaque(false);
        btListarTurmas.setContentAreaFilled(false);
        btListarTurmas.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }//GEN-LAST:event_formMouseEntered

    private void btAddTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddTurmaMouseEntered
        // TODO add your handling code here:
        btAddTurma.setOpaque(true);
        btAddTurma.setContentAreaFilled(true);
        btAddTurma.setBorderPainted(true);
        btAddTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAddTurmaMouseEntered

    private void btExcluirTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirTurmaMouseEntered
        // TODO add your handling code here:
        btExcluirTurma.setOpaque(true);
        btExcluirTurma.setContentAreaFilled(true);
        btExcluirTurma.setBorderPainted(true);
        btExcluirTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btExcluirTurmaMouseEntered

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        // TODO add your handling code here:
        btVoltar.setOpaque(true);
        btVoltar.setContentAreaFilled(true);
        btVoltar.setBorderPainted(true);
        btVoltar.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btVoltarMouseEntered

    private void btAlterarTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarTurmaMouseEntered
        // TODO add your handling code here:
        btAlterarTurma.setOpaque(true);
        btAlterarTurma.setContentAreaFilled(true);
        btAlterarTurma.setBorderPainted(true);
        btAlterarTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAlterarTurmaMouseEntered

    private void btListarTurmasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btListarTurmasMouseEntered
        // TODO add your handling code here:
        btListarTurmas.setOpaque(true);
        btListarTurmas.setContentAreaFilled(true);
        btListarTurmas.setBorderPainted(true);
        btListarTurmas.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btListarTurmasMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddTurma;
    private javax.swing.JButton btAlterarTurma;
    private javax.swing.JButton btExcluirTurma;
    private javax.swing.JButton btListarTurmas;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
