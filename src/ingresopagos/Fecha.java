
package ingresopagos;


import static ingresopagos.UIregistroPago.consulta;
import static ingresopagos.UIregistroPago.dergrado;
import static ingresopagos.UIregistroPago.matricula;
import static ingresopagos.UIregistroPago.mens1;
import static ingresopagos.UIregistroPago.mens2;
import static ingresopagos.UIregistroPago.mens3;
import static ingresopagos.UIregistroPago.mens4;
import static ingresopagos.UIregistroPago.mens5;
import static ingresopagos.UIregistroPago.nombreb;
import static ingresopagos.UIregistroPago.otros;
import static ingresopagos.UIregistroPago.papeleria;
import static ingresopagos.UIregistroPago.plataforma;
import static ingresopagos.UIregistroPago.recibo2;
import static ingresopagos.UIregistroPago.seguro;
import static ingresopagos.UIregistroPago.servsocial;
import static ingresopagos.UIregistroPago.simulacro;
import java.util.Formatter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class Fecha {
    //Declarando variables
        public static int dia,mes,anio,total,recibo;
        public static String nombre,ciclo;
        
        
    
    //Ingreso de datos  
        public void ingresoFecha(){
            dia=UIregistroPago.dia2;//Ingreso de datos fecha
            mes=UIregistroPago.mes2;
            anio=UIregistroPago.anio2;
            nombre=UIregistroPago.nombre2;
            recibo=UIregistroPago.recibo2;
            ciclo=UIregistroPago.ciclo2;
            total=UIregistroPago.total2;}//Cierra ingresoFecha
        
        
    //Verificación de la fecha    
       public void fecha() throws ParseException{//Se usa para registrar pagos de semestres anteriores o certifiacados
           Formatter dia3=new Formatter(); //Dar formato al día para mes y dia para mirar casos menores a 10
           dia3.format("%02d",dia); //Debe tener minimo 2 dígitos
           Formatter mes3=new Formatter();
           mes3.format("%02d",mes);
           String fecha1=dia3+"/"+mes3+"/"+anio; //Convierte a string la fecha
           Date fecha2=new SimpleDateFormat("dd/MM/yyyy").parse(fecha1); //La fecha ingresada se convierte a fecha real
           String fecha3=new SimpleDateFormat("dd/MM/yyyy").format(fecha2); //fecha real a String
           int a=(fecha1.equals(fecha3))?1:2; //Compara las dos fechas real y String
           if (a==1){ //Si son iguaales las dos fechas                          
               RegistroPago imp=new RegistroPago();//Llama método registropago
               //imp.imprimir();//Imprime guardando datos
               imp.registro_pagos();//Crea la conexión con base de datos
                                   }//Cierra if
           else{
               JOptionPane.showMessageDialog(null,"Revise la fecha");}
                    } //Cierra String boolean

   public void fecha2() throws ParseException{//Se usa para registrar el semestre actual
           
           Formatter dia3=new Formatter(); //Dar formato al día para mes y dia para mirar casos menores a 10
           dia3.format("%02d",dia); //Debe tener minimo 2 dígitos
           Formatter mes3=new Formatter();
           mes3.format("%02d",mes);
           String fecha1=dia3+"/"+mes3+"/"+anio; //Convierte a string la fecha
           Date fecha2=new SimpleDateFormat("dd/MM/yyyy").parse(fecha1); //La fecha ingresada se convierte a fecha real
           String fecha3=new SimpleDateFormat("dd/MM/yyyy").format(fecha2); //fecha real a String
           int a=(fecha1.equals(fecha3))?1:2; //Compara las dos fechas real y String
           if (a==1){ //Si son iguaales las dos fechas   
               //Borra texto al presionar botón registrar
                UIregistroPago.nombreb.setSelectedIndex(0);
                UIregistroPago.recibo.setText(String.valueOf(UIregistroPago.recibo2+1));
                UIregistroPago.total.setText("");UIregistroPago.matricula.setText("");UIregistroPago.seguro.setText("");UIregistroPago.papeleria.setText("");
                UIregistroPago.plataforma.setText("");UIregistroPago.simulacro.setText("");UIregistroPago.mens1.setText("");UIregistroPago.mens2.setText("");
                UIregistroPago.mens3.setText("");UIregistroPago.mens4.setText("");UIregistroPago.mens5.setText("");UIregistroPago.otros.setText("");
                UIregistroPago.servsocial.setText("");UIregistroPago.dergrado.setText("");
                UIregistroPago.ciclo.setSelectedIndex(0);UIregistroPago.consulta.setText("");
                RegistroPago imp=new RegistroPago();//Llama método registropago
                imp.registro_pagos();//Crea la conexión con base de datos e ingresa a esa tabla
                switch(ciclo){
                    case "III":imp.actualizaciclo3();
                    case "IV":imp.actualizaciclo4();
                    case "V":imp.actualizaciclo5();
                    case "VI":imp.actualizaciclo6();
                             }//Cierra switch             
                                                  }//Cierra if
           else{
               JOptionPane.showMessageDialog(null,"Revise la fecha");}
                    } //Cierra String boolean 
       
}//Cierra String fecha
