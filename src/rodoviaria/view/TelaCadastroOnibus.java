/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodoviaria.view;

import javax.swing.JOptionPane;
import rodoviaria.controller.OnibusControler;
import rodoviaria.model.Onibus;

/**
 *
 * @author Henrique
 */
public class TelaCadastroOnibus extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    public TelaCadastroOnibus() {
        initComponents();
    }

    public TelaCadastroOnibus(TelaPrincipal telaPrincipal2) {
        this.telaPrincipal = telaPrincipal2;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroOnibus = new javax.swing.JPanel();
        jLabelRota = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldRota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto Rodoviaria");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro Onibus");

        jPanelCadastroOnibus.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroOnibus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanelCadastroOnibus.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelRota.setBackground(new java.awt.Color(51, 51, 51));
        jLabelRota.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelRota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRota.setText("Rota:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTextFieldRota.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldRota.setToolTipText("Rota que o onibus ira pecorrer");

        javax.swing.GroupLayout jPanelCadastroOnibusLayout = new javax.swing.GroupLayout(jPanelCadastroOnibus);
        jPanelCadastroOnibus.setLayout(jPanelCadastroOnibusLayout);
        jPanelCadastroOnibusLayout.setHorizontalGroup(
            jPanelCadastroOnibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroOnibusLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelRota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroOnibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroOnibusLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonLimpar)
                        .addGap(117, 117, 117)
                        .addComponent(jButtonSalvar))
                    .addComponent(jTextFieldRota))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelCadastroOnibusLayout.setVerticalGroup(
            jPanelCadastroOnibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroOnibusLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanelCadastroOnibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRota)
                    .addComponent(jTextFieldRota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanelCadastroOnibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastroOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCadastroOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        OnibusControler onibusControler2 = new OnibusControler();
        Onibus o;
        boolean sucesso;
        try {
            String onibusrotas;

            onibusrotas = jTextFieldRota.getText();
            o = new Onibus(onibusrotas);

            o.setRota(onibusrotas);
            sucesso = onibusControler2.adicionarOnibus(o);
            this.jButtonLimparActionPerformed(evt);
            if (sucesso == true) {
                JOptionPane.showMessageDialog(null, "Onibus cadastrado com sucesso !!");
            } else {
                JOptionPane.showMessageDialog(null, "Campo não preenchido .");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldRota.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        telaPrincipal.setDefaultLookAndFeelDecorated(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroOnibus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelRota;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroOnibus;
    private javax.swing.JTextField jTextFieldRota;
    // End of variables declaration//GEN-END:variables
}
