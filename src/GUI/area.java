/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallercontenedores.Archivo;
import tallercontenedores.Conexion;
import tallercontenedores.contenedor_area;


/**
 *
 * @author SENA
 */
public class area extends javax.swing.JFrame {

    public static java.util.ArrayList are = new java.util.ArrayList<>();
    public static contenedor_area are2 = null;
    private DefaultTableModel model;
    /**
     * Creates new form area
     */
    public area() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreArea = new javax.swing.JTextField();
        idea = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_area = new javax.swing.JTable();
        exportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Especialidad:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(79, 124, 80, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(81, 77, 20, 16);

        nombreArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAreaActionPerformed(evt);
            }
        });
        getContentPane().add(nombreArea);
        nombreArea.setBounds(161, 113, 190, 30);
        getContentPane().add(idea);
        idea.setBounds(161, 66, 190, 30);

        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(12, 190, 80, 25);

        Modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(109, 190, 90, 25);

        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(220, 190, 70, 25);

        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(313, 190, 80, 25);

        Mostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(60, 230, 80, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AREA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(209, 29, 39, 17);

        tabla_area.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_area);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 260, 452, 180);

        exportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportar.setText("exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        getContentPane().add(exportar);
        exportar.setBounds(240, 230, 90, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ERICK\\Documents\\NetBeansProjects\\Tallercontenedores\\src\\iconos\\fondoarea.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-90, -10, 690, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAreaActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            // TODO add your handling code here:
            String nomA = nombreArea.getText().trim();
            int ide = Integer.parseInt(idea.getText().trim());
            contenedor_area are1 = new contenedor_area(ide, nomA);

            are.add(are1);

            Conexion con = new Conexion();
            con.ConexionPostgres();
            String query = "INSERT INTO area VALUES(" + ide + ",'" + nomA.trim() + "')";
            JOptionPane.showMessageDialog(this, "Registro exitoso!");
            con.actualizar(query);
            con.cerrar();

            nombreArea.setText(null);
            idea.setText(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            // TODO add your handling code here:
            //are2.setNombreA(nombreArea.getText().trim());

            Conexion con = new Conexion();
            con.ConexionPostgres();
            String query = "UPDATE area SET especialidad_area = '" + nombreArea.getText() + "' WHERE codigo_area = " + Integer.parseInt(idea.getText());
            JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
            con.actualizar(query);
            con.cerrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
            // TODO add your handling code here:
            int ide = Integer.parseInt(idea.getText().trim());

            Conexion con = new Conexion();
            con.ConexionPostgres();

            String query = "SELECT * FROM area WHERE codigo_area =" + ide;
            ResultSet rs = con.consultar(query);

            if (rs.next()) {
                nombreArea.setText(rs.getString("especialidad_area"));
                JOptionPane.showMessageDialog(this, "Busqueda Exitosa!.");
            } else {
                JOptionPane.showMessageDialog(this, "No existe el Area!");
            }

            con.cerrar();

//        boolean buscar = false;
//        contenedor_area are1 = null;
//     
//        for(int i =0; i<are.size(); i++)
//        {
//         are2 = (contenedor_area)are.get(i);
//
//         if(ide==are2.getId())
//         {
//           buscar = true;
//           break;
//         }      
//        }
//
//        if(buscar)
//        {
//          nombreArea.setText(are2.getNombreA());
//          
//        }else{
//            JOptionPane.showMessageDialog(null,"No existen datos!","ERROR",JOptionPane.ERROR_MESSAGE);
//        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        int con1 = 0;
        try {

            Conexion con = new Conexion();
            con.ConexionPostgres();
            String query = "SELECT * FROM area ORDER BY codigo_area DESC";
            java.sql.ResultSet rs = con.consultar(query);

            String data[][] = {};
            String col[] = {"ID", "NOMBRE"};
            model = new DefaultTableModel(data, col);
            tabla_area.setModel(model);

//        for(int i =0; i<are.size(); i++)
//        {
//            contenedor_area a = (contenedor_area)are.get(i);
            while (rs.next()) {
                //datosA.setText( datosA.getText() + a.getNombreA() + "\t" + a.getId() + "\n" );
                model.insertRow(con1, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                model.setValueAt(rs.getInt("codigo_area"), con1, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
                model.setValueAt(rs.getString("especialidad_area"), con1, 1);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
            }
//        }                         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        are.remove(are2);
        nombreArea.setText("");
        idea.setText("");

        try {

            int fila = tabla_area.getSelectedRow();
            String cod = "";
            cod = tabla_area.getValueAt(fila, 0).toString();

            Conexion con = new Conexion();
            con.ConexionPostgres();
            String query = "DELETE FROM area WHERE codigo_area ='" + cod + "'";
            JOptionPane.showMessageDialog(this, "El registro ha sido Eliminado!");
            con.eliminar(query);
            con.cerrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
//         String cad="ID \t Nombre \n";
//        
//        for(int i =0; i<are.size(); i++){
//        contenedor_area a = (contenedor_area)are.get(i);
//        cad+= a.getId()+ "\t" + a.getNombreA() + "\n";
//    
//     }     
//        Archivo.grabar("area.xls", cad);
        Document documento = new Document();
        String ruta = System.getProperty("user.home");
        try {
            try {
                PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/reporte.pdf"));
            } catch (DocumentException ex) {
                Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        documento.open();
        PdfPTable tabla = new PdfPTable(2);
        tabla.addCell("Codigo");
        tabla.addCell("Especialidad");

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            String query = "SELECT * FROM area";
            java.sql.ResultSet rs = con.exportar(query);

            if (rs.next()) {

                while (rs.next()) {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                }
                documento.add(tabla);
            }
            con.cerrar();
        } catch (Exception e) {
        }
        documento.close();
        JOptionPane.showMessageDialog(null, "Reporte Creado!.");
    }//GEN-LAST:event_exportarActionPerformed

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
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton exportar;
    private javax.swing.JTextField idea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombreArea;
    private javax.swing.JTable tabla_area;
    // End of variables declaration//GEN-END:variables
}
