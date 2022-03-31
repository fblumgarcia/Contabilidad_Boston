
package com.fblumgarcia.ingresogastos;
import static com.fblumgarcia.ingresogastos.UIingresoGasto.concepto;
import static com.fblumgarcia.ingresogastos.UIingresoGasto.descripcion;
import static com.fblumgarcia.ingresogastos.UIingresoGasto.valor;
import java.util.Formatter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class FechaGasto {
    //Declarando variables
        private int dia;
        private int mes;
        private int anio;
    
    //Ingreso de datos  
        public void ingresoFecha(){
            dia=UIingresoGasto.dia2;//Ingreso de datos fecha
            mes=UIingresoGasto.mes2;
            anio=UIingresoGasto.anio2;
                                           }//Cierra ingresoFecha
        
    //Verificación de la fecha    
       public void fecha() throws ParseException{
           Formatter dia3=new Formatter(); //Dar formato al día para mes y dia para mirar casos menores a 10
           dia3.format("%02d",dia); //Debe tener minimo 2 dígitos
           Formatter mes3=new Formatter();
           mes3.format("%02d",mes);
           String fecha1=dia3+"/"+mes3+"/"+anio; //Convierte a string la fecha
           Date fecha2=new SimpleDateFormat("dd/MM/yyyy").parse(fecha1); //La fecha ingresada se convierte a fecha real
           String fecha3=new SimpleDateFormat("dd/MM/yyyy").format(fecha2); //fecha real a String
           int a=(fecha1.equals(fecha3))?1:2; //Compara las dos fechas real y String
           if (a==1){ //Si son iguaales las dos fechas
                valor.setText("");
                descripcion.setText("");
                concepto.setSelectedIndex(0);
               RegistroGasto imp=new RegistroGasto();
               imp.crearConexion();
               //UIingresoGasto.descripcion2.setText("");
               
                     }//Cierra if
           else{
               JOptionPane.showMessageDialog(null,"Revise la fecha");}
                    } //Cierra String boolean

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
       
}//Cierra String fecha

