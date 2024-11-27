/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Gabriel Fernandes
 */
public class CadastroVeiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormPadrao1
     */
    public CadastroVeiculo() {
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

        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jpCamposDadosVeiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlRenavam = new javax.swing.JLabel();
        jlChassi = new javax.swing.JLabel();
        jtfPlaca = new javax.swing.JTextField();
        jtfRenavam = new javax.swing.JTextField();
        jtfChassi = new javax.swing.JTextField();
        jlModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlAnoFabricacao = new javax.swing.JLabel();
        jtfAnoFabricacao = new javax.swing.JTextField();
        jlAnoModelo = new javax.swing.JLabel();
        jtfAnoModelo = new javax.swing.JTextField();
        jlPatrimonio = new javax.swing.JLabel();
        jtfPatrimonio = new javax.swing.JTextField();
        jbQuilometragem = new javax.swing.JLabel();
        jtfQuilometragem = new javax.swing.JTextField();
        jlPlaca = new javax.swing.JLabel();
        jbCliente = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jbSalvar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");

        jbAlterar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trocar.png"))); // NOI18N
        jbAlterar.setText("Alterar");

        jbExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lixo.png"))); // NOI18N
        jbExcluir.setText("Excluir");

        jbSair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair-da-tela-cheia.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbConsultar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jbConsultar.setText("Consultar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExcluir)
                .addGap(79, 79, 79)
                .addComponent(jbSair)
                .addGap(18, 18, 18)
                .addComponent(jbConsultar)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSair)
                    .addComponent(jbConsultar))
                .addGap(27, 27, 27))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Ve�culo");

        jlRenavam.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlRenavam.setText("Renavam:");

        jlChassi.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlChassi.setText("Chassi:");

        jlModelo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlModelo.setText("Modelo:");

        jlAnoFabricacao.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlAnoFabricacao.setText("Ano de Fabrica��o:");

        jlAnoModelo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlAnoModelo.setText("Ano de Modelo:");

        jlPatrimonio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlPatrimonio.setText("Numero Patrim�nio:");

        jbQuilometragem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbQuilometragem.setText("Quilometragem:");

        jtfQuilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuilometragemActionPerformed(evt);
            }
        });

        jlPlaca.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlPlaca.setText("Placa:");

        jbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlCliente.setText("Cliente:");

        javax.swing.GroupLayout jpCamposDadosVeiculoLayout = new javax.swing.GroupLayout(jpCamposDadosVeiculo);
        jpCamposDadosVeiculo.setLayout(jpCamposDadosVeiculoLayout);
        jpCamposDadosVeiculoLayout.setHorizontalGroup(
            jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlModelo)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPatrimonio)
                            .addComponent(jtfPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlAnoFabricacao)
                                .addComponent(jtfAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbQuilometragem)
                                .addComponent(jtfQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlRenavam)
                                .addComponent(jtfRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlChassi)
                                    .addComponent(jtfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlAnoModelo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCamposDadosVeiculoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jpCamposDadosVeiculoLayout.setVerticalGroup(
            jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCamposDadosVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlaca)
                    .addComponent(jlRenavam)
                    .addComponent(jlChassi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAnoFabricacao)
                            .addComponent(jlAnoModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addComponent(jlModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCamposDadosVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addComponent(jbQuilometragem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCamposDadosVeiculoLayout.createSequentialGroup()
                        .addComponent(jlPatrimonio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpCamposDadosVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCamposDadosVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jtfQuilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuilometragemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JComboBox<String> jbCliente;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jbQuilometragem;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlAnoFabricacao;
    private javax.swing.JLabel jlAnoModelo;
    private javax.swing.JLabel jlChassi;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPatrimonio;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlRenavam;
    public javax.swing.JPanel jpCamposDadosVeiculo;
    private javax.swing.JTextField jtfAnoFabricacao;
    private javax.swing.JTextField jtfAnoModelo;
    private javax.swing.JTextField jtfChassi;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfPatrimonio;
    private javax.swing.JTextField jtfPlaca;
    private javax.swing.JTextField jtfQuilometragem;
    private javax.swing.JTextField jtfRenavam;
    // End of variables declaration//GEN-END:variables
}
