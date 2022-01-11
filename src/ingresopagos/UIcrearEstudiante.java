
package ingresopagos;

public class UIcrearEstudiante extends javax.swing.JFrame {

        public UIcrearEstudiante() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ciclo = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JTextField();
        crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Estudiante");
        setMinimumSize(new java.awt.Dimension(250, 150));
        setPreferredSize(new java.awt.Dimension(700, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ciclo.setBackground(new java.awt.Color(204, 204, 204));
        ciclo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ciclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciclo", "III", "IV", "V", "VI" }));
        ciclo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        ciclo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ciclo.setFocusCycleRoot(true);
        ciclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicloActionPerformed(evt);
            }
        });
        getContentPane().add(ciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 100));

        crear.setBackground(new java.awt.Color(153, 102, 255));
        crear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 700, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String nombre2;
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
       nombre2=nombre.getText().toUpperCase();
       nombre.setText("");
        if((String)ciclo.getSelectedItem()=="III"){
            RegistroPago cic=new RegistroPago();
            cic.creaciclo3();}
       else if((String)ciclo.getSelectedItem()=="IV"){
            RegistroPago cic=new RegistroPago();
            cic.creaciclo4();}
       else if((String)ciclo.getSelectedItem()=="V"){ 
            RegistroPago cic=new RegistroPago();
            cic.creaciclo5();}
       else if((String)ciclo.getSelectedItem()=="VI"){
            RegistroPago cic=new RegistroPago();
            cic.creaciclo6();}
    }//GEN-LAST:event_crearActionPerformed

    private void cicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicloActionPerformed
        
    }//GEN-LAST:event_cicloActionPerformed

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
            java.util.logging.Logger.getLogger(UIcrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIcrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIcrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIcrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIcrearEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ciclo;
    private javax.swing.JButton crear;
    public static javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

    private void setHorizontalAlignment(String center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
