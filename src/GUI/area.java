/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallercontenedores.Archivo;
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

        jLabel1.setText("especialidad:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(91, 124, 62, 14);

        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(91, 77, 14, 14);

        nombreArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAreaActionPerformed(evt);
            }
        });
        getContentPane().add(nombreArea);
        nombreArea.setBounds(171, 121, 180, 20);
        getContentPane().add(idea);
        idea.setBounds(171, 74, 180, 20);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(22, 190, 71, 23);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(119, 190, 75, 23);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(223, 190, 65, 23);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(323, 190, 69, 23);

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(70, 230, 69, 23);

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
        jScrollPane2.setBounds(10, 260, 452, 103);

        exportar.setText("exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        getContentPane().add(exportar);
        exportar.setBounds(250, 230, 80, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondoarea.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-90, -10, 690, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAreaActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        String nomA = nombreArea.getText().trim();
        int ide = Integer.parseInt(idea.getText().trim());    
        contenedor_area are1= new contenedor_area(ide,nomA);
        
        are.add(are1);   
        
        nombreArea.setText(null);
        idea.setText(null);
           
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        are2.setNombreA(nombreArea.getText().trim());
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        int ide = Integer.parseInt(idea.getText().trim());
        
        boolean buscar = false;
        contenedor_area are1 = null;
     
        for(int i =0; i<are.size(); i++)
        {
         are2 = (contenedor_area)are.get(i);

         if(ide==are2.getId())
         {
           buscar = true;
           break;
         }      
        }

        if(buscar)
        {
          nombreArea.setText(are2.getNombreA());
          
        }else{
            JOptionPane.showMessageDialog(null,"No existen datos!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        String data[][]={};
        String col[] = {"ID", "NOMBRE"};
        model = new DefaultTableModel(data,col);
         tabla_area.setModel(model);
         int con=0;
     
        for(int i =0; i<are.size(); i++)
        {
         contenedor_area a = (contenedor_area)are.get(i);
         //datosA.setText( datosA.getText() + a.getNombreA() + "\t" + a.getId() + "\n" );
         model.insertRow(con,new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
         model.setValueAt(a.getId(), con, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
         model.setValueAt(a.getNombreA(), con, 1);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
    }                         
    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        are.remove(are2);
       nombreArea.setText(""); idea.setText(""); 
    }//GEN-LAST:event_EliminarActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
         String cad="ID \t Nombre \n";
        
        for(int i =0; i<are.size(); i++){
        contenedor_area a = (contenedor_area)are.get(i);
        cad+= a.getId()+ "\t" + a.getNombreA() + "\n";
    
     }
     
        Archivo.grabar("area.xls", cad);
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
