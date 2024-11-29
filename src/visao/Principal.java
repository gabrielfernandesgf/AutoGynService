package visao;

//import java.awt.Graphics;
//import java.awt.Image;
//import javax.swing.ImageIcon;



/**
 *
 * @author Gabriel Fernandes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        //ImageIcon icon = new ImageIcon(getClass().getResource("/img/AUTOGYN_SERVICE.png"));
        //Image image = icon.getImage();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiVeiculos = new javax.swing.JMenuItem();
        jmiAcessorios = new javax.swing.JMenuItem();
        jmiMarcaModelo = new javax.swing.JMenuItem();
        jmOrdemServico = new javax.swing.JMenu();
        jmiNovaOs = new javax.swing.JMenuItem();
        jmiConsultarOs = new javax.swing.JMenuItem();
        jmGestaoEstoque = new javax.swing.JMenu();
        jmiPe�as = new javax.swing.JMenuItem();
        jmServicos = new javax.swing.JMenu();
        jmiCadastroServicos = new javax.swing.JMenuItem();
        jmiGerenciarServicos = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmiRelatoriosOs = new javax.swing.JMenuItem();
        jmFuncionario = new javax.swing.JMenu();
        jmiFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoGyn - Service");
        setResizable(false);

        //public void paintComponent(Graphics g){
            //g.drawImage(image,0,0,getWidth(),getHeight(),this);
            //}

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );

        jmCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro.png"))); // NOI18N
        jmCadastros.setMnemonic('C');
        jmCadastros.setText("Cadastros");
        jmCadastros.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiClientes);

        jmiVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro veiculo.png"))); // NOI18N
        jmiVeiculos.setText("Ve�culos");
        jmiVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVeiculosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiVeiculos);

        jmiAcessorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAcessorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mais.png"))); // NOI18N
        jmiAcessorios.setText("Acess�rios");
        jmiAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAcessoriosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiAcessorios);

        jmiMarcaModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marca.png"))); // NOI18N
        jmiMarcaModelo.setText("Marca / Modelo");
        jmiMarcaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMarcaModeloActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiMarcaModelo);

        jMenuBar1.add(jmCadastros);

        jmOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OS.png"))); // NOI18N
        jmOrdemServico.setMnemonic('O');
        jmOrdemServico.setText("Ordem de Servi�o");
        jmOrdemServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiNovaOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiNovaOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo-documento.png"))); // NOI18N
        jmiNovaOs.setText("Nova OS");
        jmiNovaOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovaOsActionPerformed(evt);
            }
        });
        jmOrdemServico.add(jmiNovaOs);

        jmiConsultarOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiConsultarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jmiConsultarOs.setText("Consultar OS");
        jmOrdemServico.add(jmiConsultarOs);

        jMenuBar1.add(jmOrdemServico);

        jmGestaoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque-pronto.png"))); // NOI18N
        jmGestaoEstoque.setMnemonic('G');
        jmGestaoEstoque.setText("Gest�o de Estoque");
        jmGestaoEstoque.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiPe�as.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiPe�as.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vela-de-ignicao.png"))); // NOI18N
        jmiPe�as.setText("Pe�as");
        jmiPe�as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPe�asActionPerformed(evt);
            }
        });
        jmGestaoEstoque.add(jmiPe�as);

        jMenuBar1.add(jmGestaoEstoque);

        jmServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-manuten��o-40.png"))); // NOI18N
        jmServicos.setMnemonic('S');
        jmServicos.setText("Servi�os");
        jmServicos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiCadastroServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servico.png"))); // NOI18N
        jmiCadastroServicos.setText("Cadastro de Servi�os");
        jmiCadastroServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroServicosActionPerformed(evt);
            }
        });
        jmServicos.add(jmiCadastroServicos);

        jmiGerenciarServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9375318.png"))); // NOI18N
        jmiGerenciarServicos.setText("Gerenciar Servi�os");
        jmiGerenciarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerenciarServicosActionPerformed(evt);
            }
        });
        jmServicos.add(jmiGerenciarServicos);

        jMenuBar1.add(jmServicos);

        jmRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/metrica.png"))); // NOI18N
        jmRelatorios.setMnemonic('R');
        jmRelatorios.setText("Relatorios");
        jmRelatorios.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiRelatoriosOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRelatoriosOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio.png"))); // NOI18N
        jmiRelatoriosOs.setText("Relatorios de OS");
        jmRelatorios.add(jmiRelatoriosOs);

        jMenuBar1.add(jmRelatorios);

        jmFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracoes.png"))); // NOI18N
        jmFuncionario.setText("Configura��es");
        jmFuncionario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmiFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carteira-de-identidade.png"))); // NOI18N
        jmiFuncionario.setText("Funcionario");
        jmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFuncionarioActionPerformed(evt);
            }
        });
        jmFuncionario.add(jmiFuncionario);

        jMenuBar1.add(jmFuncionario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        setSize(new java.awt.Dimension(1080, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        // TODO add your handling code here:
        CadastroClienteVisao tela = new CadastroClienteVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiPe�asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPe�asActionPerformed
        // TODO add your handling code here:
        EstoqueVisao tela = new EstoqueVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiPe�asActionPerformed

    private void jmiVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVeiculosActionPerformed
        // TODO add your handling code here:
        CadastroVeiculo tela = new CadastroVeiculo();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiVeiculosActionPerformed

    private void jmiAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAcessoriosActionPerformed
        // TODO add your handling code here:
        AcessoriosVisao tela = new AcessoriosVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiAcessoriosActionPerformed

    private void jmiNovaOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovaOsActionPerformed
        // TODO add your handling code here:
        OrdemDeServicoVisao tela = new OrdemDeServicoVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jmiNovaOsActionPerformed

    private void jmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFuncionarioActionPerformed
        // TODO add your handling code here:
        FuncionarioVisao tela = new FuncionarioVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiFuncionarioActionPerformed

    private void jmiCadastroServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroServicosActionPerformed
        // TODO add your handling code here:
        CadastroServicoVisao tela = new CadastroServicoVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadastroServicosActionPerformed

    private void jmiMarcaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMarcaModeloActionPerformed
        // TODO add your handling code here:
        CadastroMarcaModelo tela = new CadastroMarcaModelo();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiMarcaModeloActionPerformed

    private void jmiGerenciarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerenciarServicosActionPerformed
        // TODO add your handling code here:
        GerenciarServicosVisao tela = new GerenciarServicosVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiGerenciarServicosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmFuncionario;
    private javax.swing.JMenu jmGestaoEstoque;
    private javax.swing.JMenu jmOrdemServico;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmServicos;
    private javax.swing.JMenuItem jmiAcessorios;
    private javax.swing.JMenuItem jmiCadastroServicos;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiConsultarOs;
    private javax.swing.JMenuItem jmiFuncionario;
    private javax.swing.JMenuItem jmiGerenciarServicos;
    private javax.swing.JMenuItem jmiMarcaModelo;
    private javax.swing.JMenuItem jmiNovaOs;
    private javax.swing.JMenuItem jmiPe�as;
    private javax.swing.JMenuItem jmiRelatoriosOs;
    private javax.swing.JMenuItem jmiVeiculos;
    // End of variables declaration//GEN-END:variables
}
