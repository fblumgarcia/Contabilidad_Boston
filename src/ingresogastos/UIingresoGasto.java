
package ingresogastos;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UIingresoGasto extends javax.swing.JFrame {

    
    public UIingresoGasto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diai = new javax.swing.JTextField();
        mesi = new javax.swing.JTextField();
        anioi = new javax.swing.JTextField();
        concepto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Gasto");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(780, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Día");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, 100, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 100, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Año");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Concepto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 10, 100, 60));

        diai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        diai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaiActionPerformed(evt);
            }
        });
        getContentPane().add(diai, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 75, 150, 60));

        mesi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesiActionPerformed(evt);
            }
        });
        getContentPane().add(mesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 75, 150, 60));

        anioi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anioi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anioi.setText("2022");
        getContentPane().add(anioi, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 75, 150, 60));

        concepto.setBackground(new java.awt.Color(204, 204, 204));
        concepto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        concepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Arriendo", "Aseo", "Nomina", "Papeleria", "Prestamos", "Servicios", "Otros" }));
        concepto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                conceptoItemStateChanged(evt);
            }
        });
        concepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conceptoActionPerformed(evt);
            }
        });
        getContentPane().add(concepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 75, 150, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, 100, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descripción");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 60));

        valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 150, 60));

        descripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 225, 400, 60));

        registro.setBackground(new java.awt.Color(102, 255, 255));
        registro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registro.setText("Registrar");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 225, 120, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static int dia2,mes2,anio2,valor2;
    public static String concepto2, descripcion2;
    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        if("Seleccione".equals(concepto.getSelectedItem())){
            JOptionPane.showMessageDialog(null,"Ingrese un concepto");
        }else{
            try{
            dia2=Integer.parseInt(diai.getText());
            mes2=Integer.parseInt(mesi.getText());
            anio2=Integer.parseInt(anioi.getText());
            valor2=Integer.parseInt(valor.getText());
            concepto2=(String)concepto.getSelectedItem();
            descripcion2=descripcion.getText().toUpperCase();
            FechaGasto fec=new FechaGasto();
            fec.ingresoFecha();
            try {
                fec.fecha();
            } catch (ParseException ex) {
                Logger.getLogger(UIingresoGasto.class.getName()).log(Level.SEVERE, null, ex);
            }}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Verifique datos ingresados");
        }}
    }//GEN-LAST:event_registroActionPerformed
             
    private void mesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesiActionPerformed
        
    }//GEN-LAST:event_mesiActionPerformed

    private void diaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaiActionPerformed
              
    }//GEN-LAST:event_diaiActionPerformed

    private void conceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conceptoActionPerformed
        
    }//GEN-LAST:event_conceptoActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void conceptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_conceptoItemStateChanged
       
    }//GEN-LAST:event_conceptoItemStateChanged

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIingresoGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioi;
    public static javax.swing.JComboBox<String> concepto;
    public static javax.swing.JTextField descripcion;
    public javax.swing.JTextField diai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mesi;
    private javax.swing.JButton registro;
    public static javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

     

    
}
