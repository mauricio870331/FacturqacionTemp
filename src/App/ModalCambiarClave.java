/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Adalberto Gomez
 */
public class ModalCambiarClave extends javax.swing.JDialog {

    /**
     * Creates new form ModalCambiarClave
     */
    public ModalCambiarClave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        txtClaveActual = new javax.swing.JPasswordField();
        txtNuevaClave = new javax.swing.JPasswordField();
        txtNuevaClave2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelarCambioClave = new javax.swing.JButton();
        btnActualizarClave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cambiar Clave");
        setMinimumSize(new java.awt.Dimension(333, 179));
        setPreferredSize(new java.awt.Dimension(333, 179));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave Actual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(txtClaveActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));
        getContentPane().add(txtNuevaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 190, -1));
        getContentPane().add(txtNuevaClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, -1));

        jLabel2.setText("Nueva Clave");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Confirmar Clave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnCancelarCambioClave.setText("Cancelar");
        btnCancelarCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCambioClaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCambioClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        btnActualizarClave.setText("Actualizar");
        getContentPane().add(btnActualizarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambioClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCambioClaveActionPerformed

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
            java.util.logging.Logger.getLogger(ModalCambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalCambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalCambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalCambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModalCambiarClave dialog = new ModalCambiarClave(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarClave;
    public javax.swing.JButton btnCancelarCambioClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPasswordField txtClaveActual;
    public javax.swing.JPasswordField txtNuevaClave;
    public javax.swing.JPasswordField txtNuevaClave2;
    // End of variables declaration//GEN-END:variables
}