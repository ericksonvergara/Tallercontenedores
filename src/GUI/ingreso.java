/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import static GUI.paciente.pac;
import static GUI.paciente.pac2;
import java.text.DateFormat;
import tallercontenedores.contenedor_ingreso;
import tallercontenedores.contenedor_paciente;
import java.text.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author SENA
 */
public class ingreso extends javax.swing.JFrame {
    public static java.util.ArrayList ingreso = new java.util.ArrayList();
    public static contenedor_ingreso ingreso2 = null;
    private DefaultTableModel model;
    
    public static String formato = "dd/MMM/yyyy";
    public static String fecha;
    public static DateFormat formato1;
    

    /**
     * Creates new form estado
     */
    public ingreso() {
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

        jMonthChooserBeanInfo1 = new com.toedter.calendar.JMonthChooserBeanInfo();
        jLabel1 = new javax.swing.JLabel();
        fecha_i = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_ingreso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(617, 526));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("INGRESO DEL PACIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(131, 24, 176, 17);

        fecha_i.setMinSelectableDate(new java.util.Date(-62135747899000L));
        getContentPane().add(fecha_i);
        fecha_i.setBounds(227, 137, 81, 20);

        jLabel2.setText("Fecha ingreso:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(138, 143, 71, 14);

        jLabel4.setText("Cedula: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 83, 40, 14);
        getContentPane().add(cedula);
        cedula.setBounds(68, 80, 90, 20);

        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(166, 83, 41, 14);

        nombre.setEditable(false);
        getContentPane().add(nombre);
        nombre.setBounds(220, 70, 220, 30);

        buscar.setText("buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(80, 200, 80, 23);

        agregar.setText("agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(190, 200, 71, 23);

        enviar.setText("mostrar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(290, 200, 69, 23);

        tabla_ingreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Fecha de ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_ingreso);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 290, 452, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondoIngreso.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -20, 520, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        int ced = Integer.parseInt(cedula.getText().trim());
        
        boolean buscar = false;
        contenedor_ingreso in = null;
     
        for(int i =0; i<pac.size(); i++)
        {
         pac2 = (contenedor_paciente)pac.get(i);

         if(ced==pac2.getCedula())
         {
           buscar = true;
           break;
         }      
        }

        if(buscar)
        {
        nombre.setText(pac2.getNombre());
        }else{
            
        }
        
        
    }//GEN-LAST:event_buscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        int ced = Integer.parseInt(cedula.getText().trim());
        String nombre_paciente = pac2.getNombre().trim();
        boolean saber = false;
        contenedor_ingreso ingreso_a = null;
     
        for(int i =0; i<pac.size(); i++)
        {
        pac2=(contenedor_paciente)pac.get(i);
      
        if(ced==pac2.getCedula());
        {
        saber = true;
        break;
      }      
     }
        if(saber)
        {
        String nom = (String) nombre.getName();        
        contenedor_ingreso ing = new contenedor_ingreso(ced, nom, fecha_i.getDate());
        ingreso.add(ing);
     }else{
            
        }
        cedula.setText(null);
        nombre.setText(nombre_paciente);
        fecha_i.setDate(null);
        
    }//GEN-LAST:event_agregarActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        //datos.setText(null);
        String data[][]={};
        String col[] = {"CEDULA", "NOMBRE","Fecha ingreso"};
        model = new DefaultTableModel(data,col);
         tabla_ingreso.setModel(model);
         int con=0;
        formato1 = DateFormat.getDateInstance();
        for (int i = 0; i<ingreso.size(); i++){
            contenedor_ingreso ingre = (contenedor_ingreso) ingreso.get(i);
            //datos.setText( datos.getText() + ingre.getCedula() + "\t" + pac2.getNombre() + "\t" + formato1.format(ingre.getFecha_ingreso()) + "\n" );
             model.insertRow(con,new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
             model.setValueAt(ingre.getCedula(), con, 0);
             model.setValueAt(pac2.getNombre(), con, 1);
             model.setValueAt(formato1.format(ingre.getFecha_ingreso()), con, 2);
        }
    }//GEN-LAST:event_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton enviar;
    private com.toedter.calendar.JDateChooser fecha_i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JMonthChooserBeanInfo jMonthChooserBeanInfo1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla_ingreso;
    // End of variables declaration//GEN-END:variables
}
