
package ingresopagos;

public class UIcrearEstudiante extends javax.swing.JFrame {

        public UIcrearEstudiante() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ciclo = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        semestre = new javax.swing.JComboBox<>();
        aniot = new javax.swing.JTextField();
        textoAniot = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Estudiante");
        setMinimumSize(new java.awt.Dimension(250, 150));
        setPreferredSize(new java.awt.Dimension(700, 250));
        setResizable(false);

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

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setText("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        crear.setBackground(new java.awt.Color(153, 102, 255));
        crear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        semestre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre", "I", "II" }));

        aniot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aniot.setText("20");

        textoAniot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoAniot.setText("AÑO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoAniot)
                        .addGap(49, 49, 49)
                        .addComponent(aniot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aniot)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoAniot))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String nombre2,semestre2;
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
       nombre2=nombre.getText().toUpperCase();
       semestre2=aniot.getText()+"-"+(String) semestre.getSelectedItem();       
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

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
    private javax.swing.JTextField aniot;
    private javax.swing.JComboBox<String> ciclo;
    private javax.swing.JButton crear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> semestre;
    private javax.swing.JLabel textoAniot;
    // End of variables declaration//GEN-END:variables

    private void setHorizontalAlignment(String center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
