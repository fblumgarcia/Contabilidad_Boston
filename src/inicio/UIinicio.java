//Elaborado por Fernando Blum García
package inicio;

import Exportarbd.UIexportar;
import ingresogastos.UIingresoGasto;
import ingresopagos.UIbotones;



public class UIinicio extends javax.swing.JFrame {

    public UIinicio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingPagos = new javax.swing.JButton();
        ingGastos = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        exportar = new javax.swing.JButton();
        escudo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contabilidad Bostón");
        setPreferredSize(new java.awt.Dimension(1250, 725));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingPagos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingPagos.setText("Ingreso Pagos");
        ingPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingPagosActionPerformed(evt);
            }
        });
        getContentPane().add(ingPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 200, 100));
        ingPagos.getAccessibleContext().setAccessibleDescription("");

        ingGastos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingGastos.setText("Ingresos Gastos");
        ingGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingGastosActionPerformed(evt);
            }
        });
        getContentPane().add(ingGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 200, 100));
        ingGastos.getAccessibleContext().setAccessibleDescription("");

        pregunta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("¿Qué desea hacer?");
        getContentPane().add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 250, -1));

        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Contabilidad Colegio Bostón");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setPreferredSize(new java.awt.Dimension(1100, 29));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 20, 580, 40));

        exportar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exportar.setText("Exportar Tablas");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        getContentPane().add(exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 200, 100));
        exportar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingGastosActionPerformed
    UIingresoGasto ig = new UIingresoGasto();
    ig.setVisible(true);
    
    }//GEN-LAST:event_ingGastosActionPerformed

    private void ingPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingPagosActionPerformed
        UIbotones sc = new UIbotones();
        sc.setVisible(true);
    }//GEN-LAST:event_ingPagosActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        UIexportar sc = new UIexportar();
        sc.setVisible(true);
    }//GEN-LAST:event_exportarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIinicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escudo;
    private javax.swing.JButton exportar;
    private javax.swing.JButton ingGastos;
    private javax.swing.JButton ingPagos;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
