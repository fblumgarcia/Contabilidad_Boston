//Elaborado por Fernando Blum García
package inicio;

import Exportarbd.UIexportar;
import ingresogastos.UIingresoGasto;
import ingresopagos.RegistroPago;
import ingresopagos.UIbotones;



public class UIinicio extends javax.swing.JFrame {
    RegistroPago pc=new RegistroPago();
    public UIinicio() {
        initComponents();
        pc.pruebaConexion();      
    }
//Al presionar los botones se dirige a las ventanas correspondientes
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingPagos = new javax.swing.JButton();
        ingGastos = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        exportar = new javax.swing.JButton();
        escudo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        estadoConexion = new javax.swing.JLabel();
        pruebaConexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contabilidad Bostón");
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setMinimumSize(new java.awt.Dimension(50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingPagos.setBackground(new java.awt.Color(255, 204, 102));
        ingPagos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingPagos.setText("Ingreso Pagos");
        ingPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingPagosActionPerformed(evt);
            }
        });
        getContentPane().add(ingPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 200, 100));
        ingPagos.getAccessibleContext().setAccessibleDescription("");

        ingGastos.setBackground(new java.awt.Color(255, 153, 153));
        ingGastos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingGastos.setText("Ingresos Gastos");
        ingGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingGastosActionPerformed(evt);
            }
        });
        getContentPane().add(ingGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 200, 100));
        ingGastos.getAccessibleContext().setAccessibleDescription("");

        pregunta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("¿Qué desea hacer?");
        getContentPane().add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 250, -1));

        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 51, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Contabilidad Colegio Boston");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setPreferredSize(new java.awt.Dimension(1100, 29));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 580, 40));

        exportar.setBackground(new java.awt.Color(51, 255, 255));
        exportar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exportar.setText("Exportar Tablas");
        exportar.setPreferredSize(new java.awt.Dimension(161, 31));
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        getContentPane().add(exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 200, 100));
        exportar.getAccessibleContext().setAccessibleDescription("");

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio/Escudo.jpg"))); // NOI18N
        escudo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio/Escudo.jpg"))); // NOI18N
        getContentPane().add(escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 180, 180, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("La base de datos esta: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 25));

        estadoConexion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(estadoConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 120, 25));

        pruebaConexion.setBackground(new java.awt.Color(102, 102, 255));
        pruebaConexion.setText("Prueba conexión base de datos");
        pruebaConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaConexionActionPerformed(evt);
            }
        });
        getContentPane().add(pruebaConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

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

    private void pruebaConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaConexionActionPerformed
        pc.pruebaConexion();  
    }//GEN-LAST:event_pruebaConexionActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIinicio().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escudo;
    public static javax.swing.JLabel estadoConexion;
    private javax.swing.JButton exportar;
    private javax.swing.JButton ingGastos;
    private javax.swing.JButton ingPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton pruebaConexion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void setExtendState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
