/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author SENA
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

        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Areas = new javax.swing.JButton();
        Paciente = new javax.swing.JButton();
        ingreso = new javax.swing.JButton();
        salida = new javax.swing.JButton();
        doctor = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(626, 626));
        setMinimumSize(new java.awt.Dimension(626, 626));
        setPreferredSize(new java.awt.Dimension(626, 626));
        getContentPane().setLayout(null);

        Areas.setText("areas");
        Areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreasActionPerformed(evt);
            }
        });
        getContentPane().add(Areas);
        Areas.setBounds(0, 220, 80, 80);

        Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paciente (3).png"))); // NOI18N
        Paciente.setText("paciente");
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });
        getContentPane().add(Paciente);
        Paciente.setBounds(0, 30, 80, 80);

        ingreso.setText("ingreso");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
        getContentPane().add(ingreso);
        ingreso.setBounds(0, 310, 80, 80);

        salida.setText("salida");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        getContentPane().add(salida);
        salida.setBounds(0, 420, 80, 80);

        doctor.setText("doctor");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });
        getContentPane().add(doctor);
        doctor.setBounds(0, 130, 80, 80);

        salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\Repositorio\\Tallercontenedores\\src\\iconos\\cerrar (2).png")); // NOI18N
        salir.setText("cerrar");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(530, 0, 90, 80);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -70, 630, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
        // TODO add your handling code here:
        new paciente().setVisible(true);
    }//GEN-LAST:event_PacienteActionPerformed

    private void AreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreasActionPerformed
        // TODO add your handling code here:
        new area().setVisible(true);
    }//GEN-LAST:event_AreasActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
        // TODO add your handling code here:
        new ingreso().setVisible(true);
    }//GEN-LAST:event_ingresoActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        // TODO add your handling code here:
        new salida().setVisible(true);
    }//GEN-LAST:event_salidaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        // TODO add your handling code here:
        new doctor().setVisible(true);
    }//GEN-LAST:event_doctorActionPerformed

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
    private javax.swing.JButton Areas;
    private javax.swing.JButton Paciente;
    private javax.swing.JButton doctor;
    private javax.swing.JButton ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton salida;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
