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
public class JFrmProfessor extends javax.swing.JFrame {

    /**
     * Creates new form JFrmProfessor
     */
    public JFrmProfessor() {
        initComponents();
        btAddProfessor.setOpaque(false);
        btAddProfessor.setContentAreaFilled(false);
        btAddProfessor.setBorderPainted(false);
        btExcluirProfessor.setOpaque(false);
        btExcluirProfessor.setContentAreaFilled(false);
        btExcluirProfessor.setBorderPainted(false);
        btAlterarProfessor.setOpaque(false);
        btAlterarProfessor.setContentAreaFilled(false);
        btAlterarProfessor.setBorderPainted(false);
        btListarProfessor.setOpaque(false);
        btListarProfessor.setContentAreaFilled(false);
        btListarProfessor.setBorderPainted(false);
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

        btAddProfessor = new javax.swing.JButton();
        btExcluirProfessor = new javax.swing.JButton();
        btAlterarProfessor = new javax.swing.JButton();
        btListarProfessor = new javax.swing.JButton();
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

        btAddProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/AddProfessor.png"))); // NOI18N
        btAddProfessor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAddProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAddProfessorMouseEntered(evt);
            }
        });
        btAddProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProfessorActionPerformed(evt);
            }
        });

        btExcluirProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ExcluirProfessor.png"))); // NOI18N
        btExcluirProfessor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btExcluirProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExcluirProfessorMouseEntered(evt);
            }
        });
        btExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProfessorActionPerformed(evt);
            }
        });

        btAlterarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/AlteraProfessor.png"))); // NOI18N
        btAlterarProfessor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAlterarProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAlterarProfessorMouseEntered(evt);
            }
        });
        btAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarProfessorActionPerformed(evt);
            }
        });

        btListarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ListarProfessor.png"))); // NOI18N
        btListarProfessor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btListarProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btListarProfessorMouseEntered(evt);
            }
        });
        btListarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarProfessorActionPerformed(evt);
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
        jLabel1.setText("Adicionar Professor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Excluir Professor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Alterar Professor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Listar Professores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btAddProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btAlterarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btListarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btListarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarProfessorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAlterarProfessor ap = new JFrmAlterarProfessor();
        ap.setVisible(true);
    }//GEN-LAST:event_btAlterarProfessorActionPerformed

    private void btListarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarProfessorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmListarProfessor lc = new JFrmListarProfessor();
        lc.setVisible(true);
    }//GEN-LAST:event_btListarProfessorActionPerformed

    private void btAddProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProfessorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAddProfessor addp = new JFrmAddProfessor();
        addp.setVisible(true);
    }//GEN-LAST:event_btAddProfessorActionPerformed

    private void btExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProfessorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmExcluirProfessor ep = new JFrmExcluirProfessor();
        ep.setVisible(true);
    }//GEN-LAST:event_btExcluirProfessorActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmMenu m = new JFrmMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        btAddProfessor.setOpaque(false);
        btAddProfessor.setContentAreaFilled(false);
        btAddProfessor.setBorderPainted(false);
        btExcluirProfessor.setOpaque(false);
        btExcluirProfessor.setContentAreaFilled(false);
        btExcluirProfessor.setBorderPainted(false);
        btAlterarProfessor.setOpaque(false);
        btAlterarProfessor.setContentAreaFilled(false);
        btAlterarProfessor.setBorderPainted(false);
        btListarProfessor.setOpaque(false);
        btListarProfessor.setContentAreaFilled(false);
        btListarProfessor.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }//GEN-LAST:event_formMouseEntered

    private void btAddProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddProfessorMouseEntered
        // TODO add your handling code here:
        btAddProfessor.setOpaque(true);
        btAddProfessor.setContentAreaFilled(true);
        btAddProfessor.setBorderPainted(true);
        btAddProfessor.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAddProfessorMouseEntered

    private void btExcluirProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirProfessorMouseEntered
        // TODO add your handling code here:
        btExcluirProfessor.setOpaque(true);
        btExcluirProfessor.setContentAreaFilled(true);
        btExcluirProfessor.setBorderPainted(true);
        btExcluirProfessor.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btExcluirProfessorMouseEntered

    private void btAlterarProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarProfessorMouseEntered
        // TODO add your handling code here:
        btAlterarProfessor.setOpaque(true);
        btAlterarProfessor.setContentAreaFilled(true);
        btAlterarProfessor.setBorderPainted(true);
        btAlterarProfessor.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAlterarProfessorMouseEntered

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        // TODO add your handling code here:
        btVoltar.setOpaque(true);
        btVoltar.setContentAreaFilled(true);
        btVoltar.setBorderPainted(true);
        btVoltar.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btVoltarMouseEntered

    private void btListarProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btListarProfessorMouseEntered
        // TODO add your handling code here:
        btListarProfessor.setOpaque(true);
        btListarProfessor.setContentAreaFilled(true);
        btListarProfessor.setBorderPainted(true);
        btListarProfessor.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btListarProfessorMouseEntered

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
            java.util.logging.Logger.getLogger(JFrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProfessor;
    private javax.swing.JButton btAlterarProfessor;
    private javax.swing.JButton btExcluirProfessor;
    private javax.swing.JButton btListarProfessor;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
