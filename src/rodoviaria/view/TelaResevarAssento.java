/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodoviaria.view;

import javax.swing.JOptionPane;
import rodoviaria.model.Assento;
import rodoviaria.model.Onibus;
import rodoviaria.controller.AssentoControler;
import rodoviaria.controller.OnibusControler;

/**
 *
 * @author Henrique
 */
public class TelaResevarAssento extends javax.swing.JFrame {

    private TelaPrincipal telaprincipal2;

    /**
     * Creates new form telaResevarAssento
     *
     * @param telaprincipal2
     */
    public TelaResevarAssento(TelaPrincipal telaprincipal2) {
        initComponents();
        this.telaprincipal2 = telaprincipal2;
    }

    public TelaResevarAssento() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jPanelResevarAssento = new javax.swing.JPanel();
        jLabelOnibus = new javax.swing.JLabel();
        jTextFieldOnibus = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto Rodoviaria");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setText("Resevar Assento");

        jPanelResevarAssento.setBackground(new java.awt.Color(102, 102, 102));
        jPanelResevarAssento.setForeground(new java.awt.Color(102, 102, 102));
        jPanelResevarAssento.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelOnibus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelOnibus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOnibus.setText("Onibus:");
        jLabelOnibus.setToolTipText("");

        jTextFieldOnibus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldOnibus.setToolTipText("Onibus a ser resevado assento");

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

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelResevarAssentoLayout = new javax.swing.GroupLayout(jPanelResevarAssento);
        jPanelResevarAssento.setLayout(jPanelResevarAssentoLayout);
        jPanelResevarAssentoLayout.setHorizontalGroup(
            jPanelResevarAssentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResevarAssentoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelOnibus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResevarAssentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelResevarAssentoLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar))
                    .addComponent(jTextFieldOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanelResevarAssentoLayout.setVerticalGroup(
            jPanelResevarAssentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResevarAssentoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelResevarAssentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOnibus)
                    .addComponent(jTextFieldOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanelResevarAssentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSalvar))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelResevarAssento, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelResevarAssento, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        Onibus o;
        Assento a;
        boolean sucesso;
        AssentoControler assentoControler2 = new AssentoControler();
        OnibusControler onibusControler2 = new OnibusControler();

        try {
            String onibusrotas, lugar = "1";

            onibusrotas = jTextFieldOnibus.getText();
            o = new Onibus(onibusrotas);
            o.setRota(onibusrotas);

            sucesso = onibusControler2.resevarAssento(o);
            this.jButtonLimparActionPerformed(evt);
            if (sucesso == true) {
                a = new Assento(lugar);
                a.setLugar(lugar);
                assentoControler2.adicionarAssento(a);
                JOptionPane.showMessageDialog(null, "Assento resevado !");
            } else {
                JOptionPane.showMessageDialog(null, "Onibus lotado !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldOnibus.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        TelaPrincipal.setDefaultLookAndFeelDecorated(true);
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
            java.util.logging.Logger.getLogger(TelaResevarAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResevarAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResevarAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResevarAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResevarAssento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelOnibus;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelResevarAssento;
    private javax.swing.JTextField jTextFieldOnibus;
    // End of variables declaration//GEN-END:variables
}
