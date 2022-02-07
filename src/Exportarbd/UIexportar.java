package Exportarbd;

import ingresogastos.RegistroGasto;
import ingresopagos.RegistroPago;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UIexportar extends javax.swing.JFrame {

    public static String tables,periodo2; 
    
    public UIexportar() {
        initComponents();
    }

  public static String exporta; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecciona = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        reinicioCiclos = new javax.swing.JButton();
        reinicioPagosGastos = new javax.swing.JButton();
        exportar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        periodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exportar");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selecciona.setBackground(new java.awt.Color(204, 204, 204));
        selecciona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selecciona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ciclo III", "Ciclo IV", "Ciclo V", "Ciclo VI", "Ingresos", "Egresos" }));
        selecciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionaActionPerformed(evt);
            }
        });
        getContentPane().add(selecciona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Cuál tabla desea exportar?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 20, -1, -1));

        reinicioCiclos.setBackground(new java.awt.Color(255, 0, 51));
        reinicioCiclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reinicioCiclos.setText("Reiniciar tablas de ciclos");
        reinicioCiclos.setPreferredSize(new java.awt.Dimension(230, 31));
        reinicioCiclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicioCiclosActionPerformed(evt);
            }
        });
        getContentPane().add(reinicioCiclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 300, 260, -1));

        reinicioPagosGastos.setBackground(new java.awt.Color(255, 0, 51));
        reinicioPagosGastos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reinicioPagosGastos.setText("Reiniciar tablas de ingresos y egresos");
        reinicioPagosGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicioPagosGastosActionPerformed(evt);
            }
        });
        getContentPane().add(reinicioPagosGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 350, 370, 30));

        exportar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        getContentPane().add(exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 150, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 570, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Desea reiniciar alguna tabla?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 230, -1, -1));

        periodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoActionPerformed(evt);
            }
        });
        getContentPane().add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Semestre o Año");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionaActionPerformed
        
    }//GEN-LAST:event_seleccionaActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
    exporta=(String) selecciona.getSelectedItem();
    RegistroGasto ex=new RegistroGasto();
    RegistroPago ep=new RegistroPago();
    if(periodo.getText().isEmpty()){//Si esta vacio no puede exportar nada
        System.out.println("Ingrese período");}
    else{
    periodo2=periodo.getText();
       if(null!=exporta)switch (exporta) {
            case "Ciclo III":try {                
                ep.exportaciclo3();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
            break;
            case "Ciclo IV": try {
                ep.exportaciclo4();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
            case "Ciclo V":try {
                ep.exportaciclo5();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
            break;
            case "Ciclo VI":try {
                ep.exportaciclo6();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
            break;           
            case "Ingresos":try {
                ep.exportapagos();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
                break;
            case "Egresos":try {
                ex.exportagastos();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(UIexportar.class.getName()).log(Level.SEVERE, null, ex1);}
                break;
}//Cierra if    
}//Cierra else
             
    }//GEN-LAST:event_exportarActionPerformed

    private void reinicioCiclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicioCiclosActionPerformed
        tables="Ciclos: III,IV,V,VI";
        UIconfirmaEliminar nv=new UIconfirmaEliminar();
        nv.setVisible(true);        
    }//GEN-LAST:event_reinicioCiclosActionPerformed

    private void reinicioPagosGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicioPagosGastosActionPerformed
        tables="Ingresos y Egresos";
        UIconfirmaEliminar nv=new UIconfirmaEliminar();
        nv.setVisible(true);        
    }//GEN-LAST:event_reinicioPagosGastosActionPerformed

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoActionPerformed

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
            java.util.logging.Logger.getLogger(UIexportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIexportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIexportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIexportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIexportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField periodo;
    private javax.swing.JButton reinicioCiclos;
    private javax.swing.JButton reinicioPagosGastos;
    private javax.swing.JComboBox<String> selecciona;
    // End of variables declaration//GEN-END:variables
}
