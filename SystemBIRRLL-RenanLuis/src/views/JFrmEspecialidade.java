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
public class JFrmEspecialidade extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEspecialidade
     */
    public JFrmEspecialidade() {
        initComponents();
        btExcluirEspecialidade.setOpaque(false);
        btExcluirEspecialidade.setContentAreaFilled(false);
        btExcluirEspecialidade.setBorderPainted(false);
        btAddEspecialidade.setOpaque(false);
        btAddEspecialidade.setContentAreaFilled(false);
        btAddEspecialidade.setBorderPainted(false);
        btListarEspecialidade.setOpaque(false);
        btListarEspecialidade.setContentAreaFilled(false);
        btListarEspecialidade.setBorderPainted(false);
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

        btAddEspecialidade = new javax.swing.JButton();
        btExcluirEspecialidade = new javax.swing.JButton();
        btListarEspecialidade = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        btAddEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/AddEspecialidade.png"))); // NOI18N
        btAddEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAddEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAddEspecialidadeMouseEntered(evt);
            }
        });
        btAddEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspecialidadeActionPerformed(evt);
            }
        });

        btExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ExcluirEspecialidade.png"))); // NOI18N
        btExcluirEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btExcluirEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExcluirEspecialidadeMouseEntered(evt);
            }
        });
        btExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEspecialidadeActionPerformed(evt);
            }
        });

        btListarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ListarEspecialidade.png"))); // NOI18N
        btListarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btListarEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btListarEspecialidadeMouseEntered(evt);
            }
        });
        btListarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarEspecialidadeActionPerformed(evt);
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
        jLabel1.setText("Adicionar Especialidade");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Excluir Especialidade");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Listar Especialidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btExcluirEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btAddEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btListarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAddEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btExcluirEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btListarEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btListarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarEspecialidadeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmListarEspecialidade lc = new JFrmListarEspecialidade();
        lc.setVisible(true);
    }//GEN-LAST:event_btListarEspecialidadeActionPerformed

    private void btAddEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspecialidadeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAddEspecialidade adde = new JFrmAddEspecialidade();
        adde.setVisible(true);
    }//GEN-LAST:event_btAddEspecialidadeActionPerformed

    private void btExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEspecialidadeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmExcluirEspecialidade ee = new JFrmExcluirEspecialidade();
        ee.setVisible(true);
    }//GEN-LAST:event_btExcluirEspecialidadeActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmMenu m = new JFrmMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        btExcluirEspecialidade.setOpaque(false);
        btExcluirEspecialidade.setContentAreaFilled(false);
        btExcluirEspecialidade.setBorderPainted(false);
        btAddEspecialidade.setOpaque(false);
        btAddEspecialidade.setContentAreaFilled(false);
        btAddEspecialidade.setBorderPainted(false);
        btListarEspecialidade.setOpaque(false);
        btListarEspecialidade.setContentAreaFilled(false);
        btListarEspecialidade.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }//GEN-LAST:event_formMouseEntered

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        // TODO add your handling code here:
        btVoltar.setOpaque(true);
        btVoltar.setContentAreaFilled(true);
        btVoltar.setBorderPainted(true);
        btVoltar.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btVoltarMouseEntered

    private void btAddEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddEspecialidadeMouseEntered
        // TODO add your handling code here:
        btAddEspecialidade.setOpaque(true);
        btAddEspecialidade.setContentAreaFilled(true);
        btAddEspecialidade.setBorderPainted(true);
        btAddEspecialidade.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAddEspecialidadeMouseEntered

    private void btExcluirEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirEspecialidadeMouseEntered
        // TODO add your handling code here:
        btExcluirEspecialidade.setOpaque(true);
        btExcluirEspecialidade.setContentAreaFilled(true);
        btExcluirEspecialidade.setBorderPainted(true);
        btExcluirEspecialidade.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btExcluirEspecialidadeMouseEntered

    private void btListarEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btListarEspecialidadeMouseEntered
        // TODO add your handling code here:
        btListarEspecialidade.setOpaque(true);
        btListarEspecialidade.setContentAreaFilled(true);
        btListarEspecialidade.setBorderPainted(true);
        btListarEspecialidade.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btListarEspecialidadeMouseEntered

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
            java.util.logging.Logger.getLogger(JFrmEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEspecialidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddEspecialidade;
    private javax.swing.JButton btExcluirEspecialidade;
    private javax.swing.JButton btListarEspecialidade;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
