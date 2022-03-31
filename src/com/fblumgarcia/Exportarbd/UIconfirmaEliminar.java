
package com.fblumgarcia.Exportarbd;


import com.fblumgarcia.ingresogastos.RegistroGasto;
import com.fblumgarcia.ingresopagos.RegistroPago;

public class UIconfirmaEliminar extends javax.swing.JFrame {

    public UIconfirmaEliminar() {
        initComponents();
        tablas.setText(UIexportar.tables);//Saca el texto de la selección
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        si = new javax.swing.JButton();
        no = new javax.swing.JButton();
        tablas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmación Eliminar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("¿Esta seguro de reiniciar las tablas?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 320, -1));

        si.setBackground(new java.awt.Color(51, 255, 51));
        si.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        si.setText("Si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });
        getContentPane().add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 60));

        no.setBackground(new java.awt.Color(0, 0, 255));
        no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, 60));

        tablas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tablas.setForeground(new java.awt.Color(255, 51, 51));
        tablas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
       //Si presiona botón si ejecuta estos comandos que manda a borrar todo
        if(UIexportar.tables=="Ciclos: III,IV,V,VI"){
            RegistroPago b3=new RegistroPago();
            b3.eliminaTablaCiclos();
        }//cierra if
       else if(UIexportar.tables=="Ingresos y Egresos"){
            RegistroPago b4=new RegistroPago();
            b4.eliminapagos();
            RegistroGasto b5=new RegistroGasto();
            b5.eliminagastos();}//cierra else if
        
       dispose();
    }//GEN-LAST:event_siActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        dispose();
    }//GEN-LAST:event_noActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIconfirmaEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton no;
    private javax.swing.JButton si;
    private javax.swing.JLabel tablas;
    // End of variables declaration//GEN-END:variables
}
