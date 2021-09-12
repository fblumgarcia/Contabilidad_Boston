
package ingresopagos;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UIregistroPago extends javax.swing.JFrame {

    
    public UIregistroPago() {
        initComponents();//Se inicializa
        servsocial.setVisible(false);
        lservsocial.setVisible(false);
        dergrado.setVisible(false);
        ldergrado.setVisible(false);
        consulta.setEditable(false);
    }

    public static int dia2,mes2,anio2,valor2,total2,mens12,mens22,mens32,mens42,mens52,recibo2,mens13,mens23,mens33,mens43,mens53;//Declarando variables
    public static int otros2,servsocial2,dergrado2,papeleria2,seguro2,simulacro2,plataforma2,matricula2,otros3,servsocial3,dergrado3,papeleria3,seguro3,simulacro3,plataforma3,matricula3,total3;
    public static String recmens12,recmens22,recmens32,recmens42,recmens52,recotros2,recservsocial2,recdergrado2,recpapeleria2,recseguro2,recsimulacro2,recplataforma2;
    public static String nombre2,ciclo2,nombre3,recmatricula2;   
    //Los que tienen sufijo 3 es para la comprobación del total con conceptos
    //Los de sufijo 2 para actualizar en base de datos         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        ciclo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nombreb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        recibo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        Seguro = new javax.swing.JLabel();
        seguro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        papeleria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        plataforma = new javax.swing.JTextField();
        Plataforma = new javax.swing.JLabel();
        simulacro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mens1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mens2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mens3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        mens4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mens5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        otros = new javax.swing.JTextField();
        lservsocial = new javax.swing.JLabel();
        servsocial = new javax.swing.JTextField();
        ldergrado = new javax.swing.JLabel();
        dergrado = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Pago");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consulta.setColumns(20);
        consulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        consulta.setRows(5);
        jScrollPane1.setViewportView(consulta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 960, 310));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ciclo");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 22));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 3, 120, 27));

        ciclo.setBackground(new java.awt.Color(204, 204, 204));
        ciclo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ciclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciclo", "III", "IV", "V", "VI" }));
        ciclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicloActionPerformed(evt);
            }
        });
        getContentPane().add(ciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 3, 120, 27));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombres y Apellidos");
        jLabel1.setPreferredSize(new java.awt.Dimension(170, 27));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 3, 170, 27));

        nombreb.setBackground(new java.awt.Color(204, 204, 204));
        nombreb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        nombreb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrebActionPerformed(evt);
            }
        });
        getContentPane().add(nombreb, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 3, 250, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 3, 120, 27));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 3, 120, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Día");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 120, 27));

        dia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, 120, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mes");
        jLabel3.setPreferredSize(new java.awt.Dimension(170, 27));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 30, 170, 27));

        mes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 30, 120, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Año");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 30, 120, 27));

        anio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anio.setText("2021");
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 120, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Recibo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 57, 120, 27));

        recibo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recibo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 57, 120, 27));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Matrícula");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 57, 170, 27));

        matricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 57, 120, 27));

        Seguro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seguro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Seguro.setText("Seguro");
        getContentPane().add(Seguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 57, 120, 27));

        seguro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seguro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(seguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 57, 120, 27));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Papelería");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 84, 120, 27));

        papeleria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        papeleria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(papeleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 84, 120, 27));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plataforma");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 84, 170, 27));

        plataforma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plataforma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(plataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 84, 120, 27));

        Plataforma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Plataforma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plataforma.setText("Simulacro");
        getContentPane().add(Plataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 84, 120, 27));

        simulacro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        simulacro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(simulacro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 84, 120, 27));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mes 1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 111, 120, 27));

        mens1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mens1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mens1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 111, 120, 27));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mes 2");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 111, 170, 27));

        mens2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mens2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mens2, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 111, 120, 27));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mes 3");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 111, 120, 27));

        mens3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mens3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mens3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 111, 120, 27));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mes 4");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 138, 120, 27));

        mens4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mens4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mens4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mens4ActionPerformed(evt);
            }
        });
        getContentPane().add(mens4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 138, 120, 27));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Mes 5");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 138, 170, 27));

        mens5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mens5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mens5, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 138, 120, 27));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Otros");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 138, 120, 27));

        otros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        otros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 138, 120, 27));

        lservsocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lservsocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lservsocial.setText("Servicio Social");
        lservsocial.setPreferredSize(new java.awt.Dimension(120, 27));
        getContentPane().add(lservsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 165, 120, 27));

        servsocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        servsocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(servsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 165, 120, 27));

        ldergrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ldergrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ldergrado.setText("Derechos de grado");
        getContentPane().add(ldergrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 165, 170, 27));

        dergrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dergrado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dergrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 165, 120, 27));

        registro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registro.setText("Registrar");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 170, 27));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 960, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        try{
            dia2=Integer.parseInt(dia.getText());//Sacando el texto de las variables
            mes2=Integer.parseInt(mes.getText());
            anio2=Integer.parseInt(anio.getText());
            nombre2=(String)(nombreb.getSelectedItem());
            total2=Integer.parseInt(total.getText());
            recibo2=Integer.parseInt(recibo.getText());
            ciclo2=(String)ciclo.getSelectedItem();
            //Coge los conceptos y les saca el valor o los pone como cero y también con los recibos
            if(!"".equals(plataforma.getText())){plataforma3=Integer.parseInt(plataforma.getText());plataforma2=Integer.parseInt(plataforma.getText())+RegistroPago.getPlataformabd();recplataforma2=String.valueOf(recibo2)+"-"+RegistroPago.getRecplataformabd();}
            else{plataforma3=0;plataforma2=RegistroPago.getPlataformabd();recplataforma2=RegistroPago.getRecplataformabd();}
            if(!"".equals(matricula.getText())){matricula3=Integer.parseInt(matricula.getText());matricula2=Integer.parseInt(matricula.getText())+RegistroPago.getMatriculabd();recmatricula2=String.valueOf(recibo2)+"-"+RegistroPago.getRecmatriculabd();}
            else{matricula3=0;matricula2=RegistroPago.getMatriculabd();recmatricula2=RegistroPago.getRecmatriculabd();}          
            if(!"".equals(seguro.getText())){seguro3=Integer.parseInt(seguro.getText());seguro2=Integer.parseInt(seguro.getText())+RegistroPago.getSegurobd();recseguro2=String.valueOf(recibo2)+"-"+RegistroPago.getRecsegurobd();}
            else{seguro3=0;seguro2=RegistroPago.getSegurobd();recseguro2=RegistroPago.getRecsegurobd();}
            if(!"".equals(simulacro.getText())){simulacro3=Integer.parseInt(simulacro.getText());simulacro2=Integer.parseInt(simulacro.getText())+RegistroPago.getSimulacrobd();recsimulacro2=String.valueOf(recibo2)+"-"+RegistroPago.getRecsimulacrobd();}
            else{simulacro3=0;simulacro2=RegistroPago.getSimulacrobd();recsimulacro2=RegistroPago.getRecsimulacrobd();}
            if(!"".equals(papeleria.getText())){papeleria3=Integer.parseInt(papeleria.getText());papeleria2=Integer.parseInt(papeleria.getText())+RegistroPago.getPapeleriabd();recpapeleria2=String.valueOf(recibo2)+"-"+RegistroPago.getRecpapeleriabd();}
            else{papeleria3=0;papeleria2=RegistroPago.getPapeleriabd();recpapeleria2=RegistroPago.getRecpapeleriabd();}
            if(!"".equals(mens1.getText())){mens13=Integer.parseInt(mens1.getText());mens12=Integer.parseInt(mens1.getText())+RegistroPago.getMens1bd();recmens12=String.valueOf(recibo2)+"-"+RegistroPago.getRecmens1bd();}
            else{mens13=0;mens12=RegistroPago.getMens1bd();recmens12=RegistroPago.getRecmens1bd();}
            if(!"".equals(mens2.getText())){mens23=Integer.parseInt(mens2.getText());mens22=Integer.parseInt(mens2.getText())+RegistroPago.getMens2bd();recmens22=String.valueOf(recibo2)+"-"+RegistroPago.getRecmens2bd();}
            else{mens23=0;mens22=RegistroPago.getMens2bd();recmens22=RegistroPago.getRecmens2bd();}
            if(!"".equals(mens3.getText())){mens33=Integer.parseInt(mens3.getText());mens32=Integer.parseInt(mens3.getText())+RegistroPago.getMens3bd();recmens32=String.valueOf(recibo2)+"-"+RegistroPago.getRecmens3bd();}
            else{mens33=0;mens32=RegistroPago.getMens3bd();recmens32=RegistroPago.getRecmens3bd();}
            if(!"".equals(mens4.getText())){mens43=Integer.parseInt(mens4.getText());mens42=Integer.parseInt(mens4.getText())+RegistroPago.getMens4bd();recmens42=String.valueOf(recibo2)+"-"+RegistroPago.getRecmens4bd();}
            else{mens43=0;mens42=RegistroPago.getMens4bd();recmens42=RegistroPago.getRecmens4bd();}
            if(!"".equals(mens5.getText())){mens53=Integer.parseInt(mens5.getText());mens52=Integer.parseInt(mens5.getText())+RegistroPago.getMens5bd();recmens52=String.valueOf(recibo2)+"-"+RegistroPago.getRecmens5bd();}
            else{mens53=0;mens52=RegistroPago.getMens5bd();recmens52=RegistroPago.getRecmens5bd();}
            if(!"".equals(otros.getText())){otros3=Integer.parseInt(otros.getText());otros2=Integer.parseInt(otros.getText())+RegistroPago.getOtrosbd();recotros2=String.valueOf(recibo2)+"-"+RegistroPago.getRecotrosbd();}
            else{otros3=0;otros2=RegistroPago.getOtrosbd();recotros2=RegistroPago.getRecotrosbd();}
            if(!"".equals(servsocial.getText())){servsocial3=Integer.parseInt(servsocial.getText());servsocial2=Integer.parseInt(servsocial.getText())+1;recservsocial2=String.valueOf(recibo2);}
            else{servsocial2=0;servsocial2=1;recservsocial2="";}
            if(!"".equals(dergrado.getText())){dergrado3=Integer.parseInt(dergrado.getText());dergrado2=Integer.parseInt(dergrado.getText())+1;recdergrado2=String.valueOf(recibo2);}
            else{dergrado3=0;dergrado2=1;recdergrado2="";}
            total3=mens13+mens23+mens33+mens43+mens53+otros3+servsocial3+dergrado3+plataforma3+seguro3+papeleria3+matricula3+simulacro3;
            
            if(total2==total3){//Comprueba que concuerde el total ingresado con el de los conceptos
                ingresopagos.FechaPago fec=new ingresopagos.FechaPago();
                fec.ingresoFecha();
            try {
                fec.fecha2();
            } catch (ParseException ex) {
                Logger.getLogger(UIregistroPago.class.getName()).log(Level.SEVERE, null, ex);
            }}//Cierra try y catch e if
           else{JOptionPane.showMessageDialog(null,"No corresponde el total con los conceptos");}
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Verifique datos ingresados");
            }//Cierra catch        // TODO add your handling code here:
    }//GEN-LAST:event_registroActionPerformed

    private void cicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicloActionPerformed
      RegistroPago cic=new RegistroPago();//CArga y añade los nombres de estudiantes
        switch((String)ciclo.getSelectedItem()) {
            case "III":
                servsocial.setVisible(false);
                lservsocial.setVisible(false);
                dergrado.setVisible(false);
                ldergrado.setVisible(false);
                nombreb.removeAllItems();
                cic.carguenombreciclo3();
                break;
            case "IV":
                servsocial.setVisible(false);
                lservsocial.setVisible(false);
                dergrado.setVisible(false);
                ldergrado.setVisible(false);
                nombreb.removeAllItems();
                cic.carguenombreciclo4();
                break;
            case "V":
                servsocial.setVisible(false);
                lservsocial.setVisible(false);
                dergrado.setVisible(false);
                ldergrado.setVisible(false);
                nombreb.removeAllItems();
                cic.carguenombreciclo5();
                break;
            case "VI":
                nombreb.removeAllItems();
                servsocial.setVisible(true);
                lservsocial.setVisible(true);
                dergrado.setVisible(true);
                ldergrado.setVisible(true);
                cic.carguenombreciclo6();
                break;
            
        }
    }//GEN-LAST:event_cicloActionPerformed

    private void nombrebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrebActionPerformed
        if("III".equals((String)ciclo.getSelectedItem())){
        nombre3=(String)(nombreb.getSelectedItem());
        if(nombre3=="Seleccione"){//No hace nada apenas se selecciona el ciclo
        }
        else{RegistroPago cic=new RegistroPago();//CArga el elemento para la busqueda en la base de datos
             cic.consultaciclo3();} }
        else if("IV".equals((String)ciclo.getSelectedItem())){
        nombre3=(String)(nombreb.getSelectedItem());
        if(nombre3=="Seleccione"){//No hace nada apenas se selecciona el ciclo
        }
        else{RegistroPago cic=new RegistroPago();//CArga el elemento para la busqueda en la base de datos
             cic.consultaciclo4();} } 
        else if("V".equals((String)ciclo.getSelectedItem())){
        nombre3=(String)(nombreb.getSelectedItem());
        if(nombre3=="Seleccione"){//No hace nada apenas se selecciona el ciclo
        }
        else{RegistroPago cic=new RegistroPago();//CArga el elemento para la busqueda en la base de datos
             cic.consultaciclo5();} }
        else if("VI".equals((String)ciclo.getSelectedItem())){
        nombre3=(String)(nombreb.getSelectedItem());
        if(nombre3=="Seleccione"){//No hace nada apenas se selecciona el ciclo
        }
        else{RegistroPago cic=new RegistroPago();//CArga el elemento para la busqueda en la base de datos
             cic.consultaciclo6();} }
        
    }//GEN-LAST:event_nombrebActionPerformed

    private void mens4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mens4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mens4ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIregistroPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Plataforma;
    private javax.swing.JLabel Seguro;
    private javax.swing.JTextField anio;
    public static javax.swing.JComboBox<String> ciclo;
    public static javax.swing.JTextArea consulta;
    public static javax.swing.JTextField dergrado;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel ldergrado;
    private javax.swing.JLabel lservsocial;
    public static javax.swing.JTextField matricula;
    public static javax.swing.JTextField mens1;
    public static javax.swing.JTextField mens2;
    public static javax.swing.JTextField mens3;
    public static javax.swing.JTextField mens4;
    public static javax.swing.JTextField mens5;
    private javax.swing.JTextField mes;
    public static javax.swing.JComboBox<String> nombreb;
    public static javax.swing.JTextField otros;
    public static javax.swing.JTextField papeleria;
    public static javax.swing.JTextField plataforma;
    public static javax.swing.JTextField recibo;
    private javax.swing.JButton registro;
    public static javax.swing.JTextField seguro;
    public static javax.swing.JTextField servsocial;
    public static javax.swing.JTextField simulacro;
    public static javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
      }
