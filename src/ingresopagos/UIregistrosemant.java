
package ingresopagos;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UIregistrosemant extends javax.swing.JFrame {

    public UIregistrosemant() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    public static int dia2,mes2,anio2,valor2,total2,recibo2;//Declarando variables
    public static String nombre2,ciclo2;    
             
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        ciclo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        recibo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        semestre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Pago Semestre Anteriores o Certificados");
        setMinimumSize(new java.awt.Dimension(500, 120));
        setPreferredSize(new java.awt.Dimension(820, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ciclo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 180, 60));

        ciclo.setBackground(new java.awt.Color(204, 204, 204));
        ciclo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ciclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciclo", "III", "IV", "V", "VI" }));
        ciclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicloActionPerformed(evt);
            }
        });
        getContentPane().add(ciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 5, 220, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombres y Apellidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 5, 180, 60));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 5, 220, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 60));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Recibo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 180, 60));

        recibo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recibo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 220, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Día");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 180, 60));

        dia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 155, 220, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 155, 180, 60));

        mes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 155, 220, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Año");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 60));

        anio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anio.setText("2021");
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 220, 60));

        registro.setBackground(new java.awt.Color(51, 204, 255));
        registro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registro.setText("Registrar");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 144, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Período a pagar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 180, 60));

        semestre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        semestre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 220, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        try{
            dia2=Integer.parseInt(dia.getText());//Sacando el texto de las variables
            mes2=Integer.parseInt(mes.getText());
            anio2=Integer.parseInt(anio.getText());
            nombre2=(String)(nombre.getText()).toUpperCase()+"-"+(String)(semestre.getText()).toUpperCase();
            total2=Integer.parseInt(total.getText());
            recibo2=Integer.parseInt(recibo.getText());
            ciclo2=(String)ciclo.getSelectedItem();
                       
            ingresopagos.FechaPago fec=new ingresopagos.FechaPago();
            fec.ingresoFecha();
            try {
                fec.fecha();
            } catch (ParseException ex) {
                Logger.getLogger(UIregistrosemant.class.getName()).log(Level.SEVERE, null, ex);
            }}//Cierra try y catch//Cierra try y catch
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Verifique datos ingresados");
            }//Cierra catch        // TODO add your handling code here:
    }//GEN-LAST:event_registroActionPerformed

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
            java.util.logging.Logger.getLogger(UIregistrosemant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIregistrosemant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIregistrosemant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIregistrosemant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIregistrosemant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField anio;
    public static javax.swing.JComboBox<String> ciclo;
    public static javax.swing.JTextField dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField mes;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JTextField recibo;
    private javax.swing.JButton registro;
    public static javax.swing.JTextField semestre;
    public static javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
