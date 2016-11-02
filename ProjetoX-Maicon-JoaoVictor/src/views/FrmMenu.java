package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class FrmMenu extends javax.swing.JFrame {

    JMenuItem exitAction = new JMenuItem("Sair do Sistema");
    JMenuItem cadastrarUsuario = new JMenuItem("Novo Usuario");
    JMenuItem listarUsuario = new JMenuItem("Listar Usuarios");
    JMenuItem alterarUsuario = new JMenuItem("Alterar Usuario");
    JMenuItem excluirUsuario = new JMenuItem("Excluir Usuario");
    JMenuItem cadastrarProduto = new JMenuItem("Novo Produto");
    JMenuItem listarProduto = new JMenuItem("Listar Produto");
    JMenuItem alterarProduto = new JMenuItem("Alterar Produto");
    JMenuItem excluirProduto = new JMenuItem("Excluir Produto");
    JMenuItem cadastrarCliente = new JMenuItem("Novo Cliente");
    JMenuItem listarCliente = new JMenuItem("Listar Clientes");
    JMenuItem alterarCliente = new JMenuItem("Alterar Cliente");
    JMenuItem excluirCliente = new JMenuItem("Excluir Cliente");
    JMenuItem cadastrarComanda = new JMenuItem("Novo Comanda");
    JMenuItem listarComanda = new JMenuItem("Listar Comandas");
    JMenuItem alterarComanda = new JMenuItem("Alterar Comanda");
    JMenuItem excluirComanda = new JMenuItem("Excluir Comanda");

    public FrmMenu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(this);

        jMSistema.add(exitAction);
        jMCadastrar.add(cadastrarUsuario);
        jMCadastrar.add(cadastrarProduto);
        jMCadastrar.add(cadastrarCliente);
        jMCadastrar.add(cadastrarComanda);
        jMlistar.add(listarUsuario);
        jMlistar.add(listarProduto);
        jMlistar.add(listarCliente);
        jMlistar.add(listarComanda);
        jMalterar.add(alterarUsuario);
        jMalterar.add(alterarProduto);
        jMalterar.add(alterarCliente);
        jMalterar.add(alterarComanda);
        jMexcluir.add(excluirUsuario);
        jMexcluir.add(excluirProduto);
        jMexcluir.add(excluirCliente);
        jMexcluir.add(excluirComanda);

        sistema();
        cadastrar();
        listar();
        alterar();
        excluir();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMSistema = new javax.swing.JMenu();
        jMCadastrar = new javax.swing.JMenu();
        jMlistar = new javax.swing.JMenu();
        jMalterar = new javax.swing.JMenu();
        jMexcluir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMSistema.setText("Sistema");
        jMenuBar2.add(jMSistema);

        jMCadastrar.setText("Cadastrar");
        jMenuBar2.add(jMCadastrar);

        jMlistar.setText("Listar");
        jMenuBar2.add(jMlistar);

        jMalterar.setText("Alterar");
        jMenuBar2.add(jMalterar);

        jMexcluir.setText("Excluir");
        jMenuBar2.add(jMexcluir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sistema() {
        exitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public void cadastrar() {
        cadastrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNovoUsuario telaCadastro = new FrmNovoUsuario();
            }
        });

        cadastrarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNovoProduto telaCadastroProduto = new FrmNovoProduto();

            }
        });

        cadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNovoCliente telaCadastroProduto = new FrmNovoCliente();

            }
        });

        cadastrarComanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNovaComanda telaCadastroComanda = new FrmNovaComanda();

            }
        });

    }

    public void listar() {
        listarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmListarUsuario telaListar = new FrmListarUsuario();
            }
        });

        listarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmListarProduto telaListarProduto = new FrmListarProduto();
            }
        });

        listarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmListarCliente telaListarCliente = new FrmListarCliente();
            }
        });

        listarComanda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmListarComanda telaListarComanda = new FrmListarComanda();
            }
        });

    }

    public void alterar() {
        alterarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAtualizarUsuario telaAtualizarUsuario = new FrmAtualizarUsuario();
            }
        });

        alterarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAtualizarProduto telaAtualizarProduto = new FrmAtualizarProduto();
            }
        });

        alterarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAtualizarCliente telaAtualizarCliente = new FrmAtualizarCliente();
            }
        });

    }

    public void excluir() {
        excluirUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmExcluirUsuario telaExcluirUsuario = new FrmExcluirUsuario();
            }
        });

        excluirProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmExcluirProduto telaExcluirProduto = new FrmExcluirProduto();
            }
        });

        excluirCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmExcluirCliente telaExcluirCliente = new FrmExcluirCliente();
            }
        });

    }

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMCadastrar;
    private javax.swing.JMenu jMSistema;
    private javax.swing.JMenu jMalterar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMexcluir;
    private javax.swing.JMenu jMlistar;
    // End of variables declaration//GEN-END:variables
}
