package ingresopagos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RegistroPago {
    public static int matriculabd,papeleriabd,segurobd,plataformabd,simulacrobd,mens1bd,mens2bd,mens3bd,mens4bd,mens5bd,otrosbd,servsocialbd,dergradobd; 
    public static String recmatriculabd,recpapeleriabd,recsegurobd,recplataformabd,recsimulacrobd,recmens1bd,recmens2bd,recmens3bd,recmens4bd,recmens5bd,recotrosbd,recservsocialbd,recdergradobd;
    String dir="jdbc:mysql://localhost:3306/colboston", usr="root",pwd="1997";
    public void registro_pagos(){//LLena la tabla de registro de pagos que es la general
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO registro_pagos VALUES (?,?,?,?,?,?,?)");
              stmt.setInt(1,FechaPago.dia);
              stmt.setInt(2,FechaPago.mes);
              stmt.setInt(3,FechaPago.anio);
              stmt.setString(4,FechaPago.nombre);
              stmt.setInt(5,FechaPago.recibo);
              stmt.setString(6,FechaPago.ciclo);
              stmt.setInt(7,FechaPago.total);
              stmt.executeUpdate();
            
          }       
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);  }
                                             }//Cierra el crear conexión
    public void creaciclo3(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO iii VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              stmt.setString(1,UIcrearEstudiante.nombre2);//Lo de abajo es para llenar todas las columanas de la tabla
              stmt.setString(2,"0");stmt.setString(3,"");stmt.setString(4,"0");stmt.setString(5,"");stmt.setString(6,"0");stmt.setString(7,"");              
              stmt.setString(8,"0");stmt.setString(9,"");stmt.setString(10,"0");stmt.setString(11,"");stmt.setString(12,"0");stmt.setString(13,"");
              stmt.setString(14,"0");stmt.setString(15,"");stmt.setString(16,"0");stmt.setString(17,"");stmt.setString(18,"0");stmt.setString(19,"");
              stmt.setString(20,"0");stmt.setString(21,"");stmt.setString(22,"0");stmt.setString(23,"");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null,"Estudiante creado");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 3
    
    public void carguenombreciclo3(){//Carga todos los nombres en combobox
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from iii");
                UIregistroPago.nombreb.addItem("Seleccione");
                List estudiantes=new LinkedList<>();
                while(rs.next()){
                    estudiantes.add(rs.getString("nombre"));}//Añade nombres a un listado
                Collections.sort(estudiantes);//Organiza por orden alfabetico
                estudiantes.forEach(estudiante -> {
                    UIregistroPago.nombreb.addItem(String.valueOf(estudiante)); });//Añade al combobox
            }            
        } catch (ClassNotFoundException | SQLException e) {System.out.println(e);}}//cierra cargue nombre ciclo 3
    
   public void consultaciclo3(){//Consulta en base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *  FROM iii WHERE nombre ='"+UIregistroPago.nombre3+"'");//Realiza consulta en base de datos
            rs.next();
            //Saca los valores de los conceptos de la base de datos
            matriculabd=Integer.parseInt(rs.getString(2));papeleriabd=Integer.parseInt(rs.getString(4)); 
            segurobd=Integer.parseInt(rs.getString(6));plataformabd=Integer.parseInt(rs.getString(8));
            simulacrobd=Integer.parseInt(rs.getString(10));mens1bd=Integer.parseInt(rs.getString(12));
            mens2bd=Integer.parseInt(rs.getString(14));mens3bd=Integer.parseInt(rs.getString(16));
            mens4bd=Integer.parseInt(rs.getString(18));mens5bd=Integer.parseInt(rs.getString(20));
            otrosbd=Integer.parseInt(rs.getString(22));
            recmatriculabd=rs.getString(3);recpapeleriabd=rs.getString(5); 
            recsegurobd=rs.getString(7);recplataformabd=rs.getString(9);
            recsimulacrobd=rs.getString(11);recmens1bd=rs.getString(13);
            recmens2bd=rs.getString(15);recmens3bd=rs.getString(17);
            recmens4bd=rs.getString(19);recmens5bd=rs.getString(21);
            recotrosbd=rs.getString(23);
            //Ubicar los datos en el cuadro de abajo
            UIregistroPago.consulta.setText("Concepto Valor Recibo \nMatrícula: "+matriculabd+" "+recmatriculabd+" \nPlataforma: "+plataformabd+" "+recplataformabd+" \nPapelería: "+papeleriabd+" "+recpapeleriabd+" \nSeguro: "+segurobd+" "+recsegurobd+"\n"
            +"Simulacro: "+simulacrobd+" "+recsimulacrobd+" \nMes1: "+mens1bd+" "+recmens1bd+" \nMes2: "+mens2bd+" "+recmens2bd+" \nMes3: "+mens3bd+" "+recmens3bd+" \nMes4: "+mens4bd+" "+recmens4bd+" \nMes5: "+mens5bd+" "+recmens5bd+" \nOtros: "+otrosbd+" "+recotrosbd);           
            
            conn.close();} catch (Exception e) {System.out.println(e);}}//cierra  consulta ciclo 3
   
   public void actualizaciclo3(){//Crea al estudiante en ciclo 3
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            PreparedStatement stmt = conn.prepareStatement("UPDATE `iii` SET `matricula`=?,`recibomat`=?,`papelería`=?,`recibopap`=?,`seguro`=?,`reciboseg`=?,"
                    + "`plataforma`=?,`reciboplat`=?,`simulacro`=?,`recibosimul`=?,`mensualidad1`=?,`recmens1`=?,`mensualidad2`=?,`recmens2`=?,"
                    + "`mensualidad3`=?,`recmens3`=?,`mensualidad4`=?,`recmens4`=?,`mensualidad5`=?,`recmens5`=?,`otros`=?,`recibootr`=? WHERE `nombre`=?");//`"+UIregistroPago.nombre2+"`");//Realiza actualización en base de datos;
            
            stmt.setString(1,String.valueOf(UIregistroPago.matricula2));stmt.setString(2,UIregistroPago.recmatricula2);
            stmt.setString(3,String.valueOf(UIregistroPago.papeleria2));stmt.setString(4,UIregistroPago.recpapeleria2);
            stmt.setString(5,String.valueOf(UIregistroPago.seguro2));stmt.setString(6,UIregistroPago.recseguro2);
            stmt.setString(7,String.valueOf(UIregistroPago.plataforma2));stmt.setString(8,UIregistroPago.recplataforma2);
            stmt.setString(9,String.valueOf(UIregistroPago.simulacro2));stmt.setString(10,UIregistroPago.recsimulacro2);
            stmt.setString(11,String.valueOf(UIregistroPago.mens12));stmt.setString(12,UIregistroPago.recmens12);
            stmt.setString(13,String.valueOf(UIregistroPago.mens22));stmt.setString(14,UIregistroPago.recmens22);
            stmt.setString(15,String.valueOf(UIregistroPago.mens32));stmt.setString(16,UIregistroPago.recmens32);
            stmt.setString(17,String.valueOf(UIregistroPago.mens42));stmt.setString(18,UIregistroPago.recmens42);
            stmt.setString(19,String.valueOf(UIregistroPago.mens52));stmt.setString(20,UIregistroPago.recmens52);
            stmt.setString(21,String.valueOf(UIregistroPago.otros2));stmt.setString(22,UIregistroPago.recotros2);
            stmt.setString(23,String.valueOf(UIregistroPago.nombre2));          
            stmt.executeUpdate();
            if(stmt.executeUpdate()>0){JOptionPane.showMessageDialog(null,"Datos guardados");}
            conn.close();}       
            catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el actualizar ciclo 3
   
   public void creaciclo4(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO iv VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              stmt.setString(1,UIcrearEstudiante.nombre2);//Lo de abajo es para llenar todas las columanas de la tabla
              stmt.setString(2,"0");stmt.setString(3,"");stmt.setString(4,"0");stmt.setString(5,"");stmt.setString(6,"0");stmt.setString(7,"");              
              stmt.setString(8,"0");stmt.setString(9,"");stmt.setString(10,"0");stmt.setString(11,"");stmt.setString(12,"0");stmt.setString(13,"");
              stmt.setString(14,"0");stmt.setString(15,"");stmt.setString(16,"0");stmt.setString(17,"");stmt.setString(18,"0");stmt.setString(19,"");
              stmt.setString(20,"0");stmt.setString(21,"");stmt.setString(22,"0");stmt.setString(23,"");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null,"Estudiante creado");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 4
    
    public void carguenombreciclo4(){//Carga todos los nombres en combobox
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from iv");
                UIregistroPago.nombreb.addItem("Seleccione");
                List estudiantes=new LinkedList<>();
                while(rs.next()){
                    estudiantes.add(rs.getString("nombre"));}//Añade nombres a un listado
                Collections.sort(estudiantes);//Organiza por orden alfabetico
                estudiantes.forEach(estudiante -> {
                    UIregistroPago.nombreb.addItem(String.valueOf(estudiante));});//Añade al combobox
            }            
        } catch (ClassNotFoundException | SQLException e) {System.out.println(e);}}//cierra cargue nombre ciclo 4
    
   public void consultaciclo4(){//Consulta en base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *  FROM iv WHERE nombre ='"+UIregistroPago.nombre3+"'");//Realiza consulta en base de datos
            rs.next();
            //Saca los valores de los conceptos de la base de datos
            matriculabd=Integer.parseInt(rs.getString(2));papeleriabd=Integer.parseInt(rs.getString(4)); 
            segurobd=Integer.parseInt(rs.getString(6));plataformabd=Integer.parseInt(rs.getString(8));
            simulacrobd=Integer.parseInt(rs.getString(10));mens1bd=Integer.parseInt(rs.getString(12));
            mens2bd=Integer.parseInt(rs.getString(14));mens3bd=Integer.parseInt(rs.getString(16));
            mens4bd=Integer.parseInt(rs.getString(18));mens5bd=Integer.parseInt(rs.getString(20));
            otrosbd=Integer.parseInt(rs.getString(22));
            recmatriculabd=rs.getString(3);recpapeleriabd=rs.getString(5); 
            recsegurobd=rs.getString(7);recplataformabd=rs.getString(9);
            recsimulacrobd=rs.getString(11);recmens1bd=rs.getString(13);
            recmens2bd=rs.getString(15);recmens3bd=rs.getString(17);
            recmens4bd=rs.getString(19);recmens5bd=rs.getString(21);
            recotrosbd=rs.getString(23);
            //Ubicar los datos en el cuadro de abajo
            UIregistroPago.consulta.setText("Concepto Valor Recibo \nMatrícula: "+matriculabd+" "+recmatriculabd+" \nPlataforma: "+plataformabd+" "+recplataformabd+" \nPapelería: "+papeleriabd+" "+recpapeleriabd+" \nSeguro: "+segurobd+" "+recsegurobd+"\n"
            +"Simulacro: "+simulacrobd+" "+recsimulacrobd+" \nMes1: "+mens1bd+" "+recmens1bd+" \nMes2: "+mens2bd+" "+recmens2bd+" \nMes3: "+mens3bd+" "+recmens3bd+" \nMes4: "+mens4bd+" "+recmens4bd+" \nMes5: "+mens5bd+" "+recmens5bd+" \nOtros: "+otrosbd+" "+recotrosbd);           
            
            conn.close();} catch (Exception e) {System.out.println(e);}}//cierra  consulta ciclo 4
   
   public void actualizaciclo4(){//Crea al estudiante en ciclo 3
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            PreparedStatement stmt = conn.prepareStatement("UPDATE `iv` SET `matricula`=?,`recibomat`=?,`papelería`=?,`recibopap`=?,`seguro`=?,`reciboseg`=?,"
                    + "`plataforma`=?,`reciboplat`=?,`simulacro`=?,`recibosimul`=?,`mensualidad1`=?,`recmens1`=?,`mensualidad2`=?,`recmens2`=?,"
                    + "`mensualidad3`=?,`recmens3`=?,`mensualidad4`=?,`recmens4`=?,`mensualidad5`=?,`recmens5`=?,`otros`=?,`recibootr`=? WHERE `nombre`=?");//`"+UIregistroPago.nombre2+"`");//Realiza actualización en base de datos;
            
            stmt.setString(1,String.valueOf(UIregistroPago.matricula2));stmt.setString(2,UIregistroPago.recmatricula2);
            stmt.setString(3,String.valueOf(UIregistroPago.papeleria2));stmt.setString(4,UIregistroPago.recpapeleria2);
            stmt.setString(5,String.valueOf(UIregistroPago.seguro2));stmt.setString(6,UIregistroPago.recseguro2);
            stmt.setString(7,String.valueOf(UIregistroPago.plataforma2));stmt.setString(8,UIregistroPago.recplataforma2);
            stmt.setString(9,String.valueOf(UIregistroPago.simulacro2));stmt.setString(10,UIregistroPago.recsimulacro2);
            stmt.setString(11,String.valueOf(UIregistroPago.mens12));stmt.setString(12,UIregistroPago.recmens12);
            stmt.setString(13,String.valueOf(UIregistroPago.mens22));stmt.setString(14,UIregistroPago.recmens22);
            stmt.setString(15,String.valueOf(UIregistroPago.mens32));stmt.setString(16,UIregistroPago.recmens32);
            stmt.setString(17,String.valueOf(UIregistroPago.mens42));stmt.setString(18,UIregistroPago.recmens42);
            stmt.setString(19,String.valueOf(UIregistroPago.mens52));stmt.setString(20,UIregistroPago.recmens52);
            stmt.setString(21,String.valueOf(UIregistroPago.otros2));stmt.setString(22,UIregistroPago.recotros2);
            stmt.setString(23,String.valueOf(UIregistroPago.nombre2));          
            stmt.executeUpdate();
            if(stmt.executeUpdate()>0){JOptionPane.showMessageDialog(null,"Datos guardados");}
            conn.close();}       
            catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el actualizar ciclo 4
   
   public void creaciclo5(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO v VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              stmt.setString(1,UIcrearEstudiante.nombre2);//Lo de abajo es para llenar todas las columanas de la tabla
              stmt.setString(2,"0");stmt.setString(3,"");stmt.setString(4,"0");stmt.setString(5,"");stmt.setString(6,"0");stmt.setString(7,"");              
              stmt.setString(8,"0");stmt.setString(9,"");stmt.setString(10,"0");stmt.setString(11,"");stmt.setString(12,"0");stmt.setString(13,"");
              stmt.setString(14,"0");stmt.setString(15,"");stmt.setString(16,"0");stmt.setString(17,"");stmt.setString(18,"0");stmt.setString(19,"");
              stmt.setString(20,"0");stmt.setString(21,"");stmt.setString(22,"0");stmt.setString(23,"");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null,"Estudiante creado");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 5
    
    public void carguenombreciclo5(){//Carga todos los nombres en combobox
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from v");
                UIregistroPago.nombreb.addItem("Seleccione");
                List estudiantes=new LinkedList<>();
                while(rs.next()){
                    estudiantes.add(rs.getString("nombre"));}//Añade nombres a un listado
                Collections.sort(estudiantes);//Organiza por orden alfabetico
                estudiantes.forEach(estudiante -> {
                    UIregistroPago.nombreb.addItem(String.valueOf(estudiante));});//Añade al combobox
            }            
        } catch (ClassNotFoundException | SQLException e) {System.out.println(e);}}//cierra cargue nombre ciclo 5
    
   public void consultaciclo5(){//Consulta en base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *  FROM v WHERE nombre ='"+UIregistroPago.nombre3+"'");//Realiza consulta en base de datos
            rs.next();
            //Saca los valores de los conceptos de la base de datos
            matriculabd=Integer.parseInt(rs.getString(2));papeleriabd=Integer.parseInt(rs.getString(4)); 
            segurobd=Integer.parseInt(rs.getString(6));plataformabd=Integer.parseInt(rs.getString(8));
            simulacrobd=Integer.parseInt(rs.getString(10));mens1bd=Integer.parseInt(rs.getString(12));
            mens2bd=Integer.parseInt(rs.getString(14));mens3bd=Integer.parseInt(rs.getString(16));
            mens4bd=Integer.parseInt(rs.getString(18));mens5bd=Integer.parseInt(rs.getString(20));
            otrosbd=Integer.parseInt(rs.getString(22));
            recmatriculabd=rs.getString(3);recpapeleriabd=rs.getString(5); 
            recsegurobd=rs.getString(7);recplataformabd=rs.getString(9);
            recsimulacrobd=rs.getString(11);recmens1bd=rs.getString(13);
            recmens2bd=rs.getString(15);recmens3bd=rs.getString(17);
            recmens4bd=rs.getString(19);recmens5bd=rs.getString(21);
            recotrosbd=rs.getString(23);
            //Ubicar los datos en el cuadro de abajo
            UIregistroPago.consulta.setText("Concepto Valor Recibo \nMatrícula: "+matriculabd+" "+recmatriculabd+" \nPlataforma: "+plataformabd+" "+recplataformabd+" \nPapelería: "+papeleriabd+" "+recpapeleriabd+" \nSeguro: "+segurobd+" "+recsegurobd+"\n"
            +"Simulacro: "+simulacrobd+" "+recsimulacrobd+" \nMes1: "+mens1bd+" "+recmens1bd+" \nMes2: "+mens2bd+" "+recmens2bd+" \nMes3: "+mens3bd+" "+recmens3bd+" \nMes4: "+mens4bd+" "+recmens4bd+" \nMes5: "+mens5bd+" "+recmens5bd+" \nOtros: "+otrosbd+" "+recotrosbd);           
            
            conn.close();} catch (Exception e) {System.out.println(e);}}//cierra  consulta ciclo 5
   
   public void actualizaciclo5(){//Crea al estudiante en ciclo 5
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            PreparedStatement stmt = conn.prepareStatement("UPDATE `v` SET `matricula`=?,`recibomat`=?,`papelería`=?,`recibopap`=?,`seguro`=?,`reciboseg`=?,"
                    + "`plataforma`=?,`reciboplat`=?,`simulacro`=?,`recibosimul`=?,`mensualidad1`=?,`recmens1`=?,`mensualidad2`=?,`recmens2`=?,"
                    + "`mensualidad3`=?,`recmens3`=?,`mensualidad4`=?,`recmens4`=?,`mensualidad5`=?,`recmens5`=?,`otros`=?,`recibootr`=? WHERE `nombre`=?");//`"+UIregistroPago.nombre2+"`");//Realiza actualización en base de datos;
            
            stmt.setString(1,String.valueOf(UIregistroPago.matricula2));stmt.setString(2,UIregistroPago.recmatricula2);
            stmt.setString(3,String.valueOf(UIregistroPago.papeleria2));stmt.setString(4,UIregistroPago.recpapeleria2);
            stmt.setString(5,String.valueOf(UIregistroPago.seguro2));stmt.setString(6,UIregistroPago.recseguro2);
            stmt.setString(7,String.valueOf(UIregistroPago.plataforma2));stmt.setString(8,UIregistroPago.recplataforma2);
            stmt.setString(9,String.valueOf(UIregistroPago.simulacro2));stmt.setString(10,UIregistroPago.recsimulacro2);
            stmt.setString(11,String.valueOf(UIregistroPago.mens12));stmt.setString(12,UIregistroPago.recmens12);
            stmt.setString(13,String.valueOf(UIregistroPago.mens22));stmt.setString(14,UIregistroPago.recmens22);
            stmt.setString(15,String.valueOf(UIregistroPago.mens32));stmt.setString(16,UIregistroPago.recmens32);
            stmt.setString(17,String.valueOf(UIregistroPago.mens42));stmt.setString(18,UIregistroPago.recmens42);
            stmt.setString(19,String.valueOf(UIregistroPago.mens52));stmt.setString(20,UIregistroPago.recmens52);
            stmt.setString(21,String.valueOf(UIregistroPago.otros2));stmt.setString(22,UIregistroPago.recotros2);
            stmt.setString(23,String.valueOf(UIregistroPago.nombre2));          
            stmt.executeUpdate();
            if(stmt.executeUpdate()>0){JOptionPane.showMessageDialog(null,"Datos guardados");}
            conn.close();}       
            catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el actualizar ciclo 5
   
   public void creaciclo6(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO vi VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              stmt.setString(1,UIcrearEstudiante.nombre2);//Lo de abajo es para llenar todas las columanas de la tabla
              stmt.setString(2,"0");stmt.setString(3,"");stmt.setString(4,"0");stmt.setString(5,"");stmt.setString(6,"0");stmt.setString(7,"");              
              stmt.setString(8,"0");stmt.setString(9,"");stmt.setString(10,"0");stmt.setString(11,"");stmt.setString(12,"0");stmt.setString(13,"");
              stmt.setString(14,"0");stmt.setString(15,"");stmt.setString(16,"0");stmt.setString(17,"");stmt.setString(18,"0");stmt.setString(19,"");
              stmt.setString(20,"0");stmt.setString(21,"");stmt.setString(22,"0");stmt.setString(23,"");stmt.setString(24,"0");stmt.setString(25,"");
              stmt.setString(26,"0");stmt.setString(27,"");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null,"Estudiante creado");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 3
    
    public void carguenombreciclo6(){//Carga todos los nombres en combobox
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from vi");
                UIregistroPago.nombreb.addItem("Seleccione");
                List estudiantes=new LinkedList<>();
                while(rs.next()){
                    estudiantes.add(rs.getString("nombre"));}//Añade nombres a un listado
                Collections.sort(estudiantes);//Organiza por orden alfabetico
                estudiantes.forEach(estudiante -> {
                    UIregistroPago.nombreb.addItem(String.valueOf(estudiante));});//Añade al combobox
            }            
        } catch (ClassNotFoundException | SQLException e) {System.out.println(e);}}//cierra cargue nombre ciclo 6
    
   public void consultaciclo6(){//Consulta en base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *  FROM vi WHERE nombre ='"+UIregistroPago.nombre3+"'");//Realiza consulta en base de datos
            rs.next();
            //Saca los valores de los conceptos de la base de datos
            matriculabd=Integer.parseInt(rs.getString(2));papeleriabd=Integer.parseInt(rs.getString(4)); 
            segurobd=Integer.parseInt(rs.getString(6));plataformabd=Integer.parseInt(rs.getString(8));
            simulacrobd=Integer.parseInt(rs.getString(10));mens1bd=Integer.parseInt(rs.getString(12));
            mens2bd=Integer.parseInt(rs.getString(14));mens3bd=Integer.parseInt(rs.getString(16));
            mens4bd=Integer.parseInt(rs.getString(18));mens5bd=Integer.parseInt(rs.getString(20));
            otrosbd=Integer.parseInt(rs.getString(22));servsocialbd=Integer.parseInt(rs.getString(24));
            dergradobd=Integer.parseInt(rs.getString(26));       
            recmatriculabd=rs.getString(3);recpapeleriabd=rs.getString(5); 
            recsegurobd=rs.getString(7);recplataformabd=rs.getString(9);
            recsimulacrobd=rs.getString(11);recmens1bd=rs.getString(13);
            recmens2bd=rs.getString(15);recmens3bd=rs.getString(17);
            recmens4bd=rs.getString(19);recmens5bd=rs.getString(21);
            recotrosbd=rs.getString(23);recservsocialbd=rs.getString(25);
            recdergradobd=rs.getString(27);
            //Ubicar los datos en el cuadro de abajo
            UIregistroPago.consulta.setText("Concepto Valor Recibo \nMatrícula: "+matriculabd+" "+recmatriculabd+" \nPlataforma: "+plataformabd+" "+recplataformabd+" \nPapelería: "+papeleriabd+" "+recpapeleriabd+" \nSeguro: "+segurobd+" "+recsegurobd+"\n"
            +"Simulacro: "+simulacrobd+" "+recsimulacrobd+" \nMes1: "+mens1bd+" "+recmens1bd+" \nMes2: "+mens2bd+" "+recmens2bd+" \nMes3: "+mens3bd+" "+recmens3bd+" \nMes4: "+mens4bd+" "+recmens4bd+" \nMes5: "+mens5bd+" "+recmens5bd+" \nOtros: "+otrosbd+" "+recotrosbd+" \nServicio Social: "+servsocialbd+" "+recservsocialbd+"\nDerechos de grado: "+dergradobd+" "+recdergradobd);           
            
            conn.close();} catch (Exception e) {System.out.println(e);}}//cierra  consulta ciclo 6
   
   public void actualizaciclo6(){//Crea al estudiante en ciclo 6
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dir,usr,pwd);
            PreparedStatement stmt = conn.prepareStatement("UPDATE `vi` SET `matricula`=?,`recibomat`=?,`papelería`=?,`recibopap`=?,`seguro`=?,`reciboseg`=?,"
                    + "`plataforma`=?,`reciboplat`=?,`simulacro`=?,`recibosimul`=?,`mensualidad1`=?,`recmens1`=?,`mensualidad2`=?,`recmens2`=?,"
                    + "`mensualidad3`=?,`recmens3`=?,`mensualidad4`=?,`recmens4`=?,`mensualidad5`=?,`recmens5`=?,`otros`=?,`recibootr`=?,`servsocial`=?,`recservsocial`=?,"
                    + "`dergrado`=?,`recdergrado`=? WHERE `nombre`=?");//`"+UIregistroPago.nombre2+"`");//Realiza actualización en base de datos;
            
            stmt.setString(1,String.valueOf(UIregistroPago.matricula2));stmt.setString(2,UIregistroPago.recmatricula2);
            stmt.setString(3,String.valueOf(UIregistroPago.papeleria2));stmt.setString(4,UIregistroPago.recpapeleria2);
            stmt.setString(5,String.valueOf(UIregistroPago.seguro2));stmt.setString(6,UIregistroPago.recseguro2);
            stmt.setString(7,String.valueOf(UIregistroPago.plataforma2));stmt.setString(8,UIregistroPago.recplataforma2);
            stmt.setString(9,String.valueOf(UIregistroPago.simulacro2));stmt.setString(10,UIregistroPago.recsimulacro2);
            stmt.setString(11,String.valueOf(UIregistroPago.mens12));stmt.setString(12,UIregistroPago.recmens12);
            stmt.setString(13,String.valueOf(UIregistroPago.mens22));stmt.setString(14,UIregistroPago.recmens22);
            stmt.setString(15,String.valueOf(UIregistroPago.mens32));stmt.setString(16,UIregistroPago.recmens32);
            stmt.setString(17,String.valueOf(UIregistroPago.mens42));stmt.setString(18,UIregistroPago.recmens42);
            stmt.setString(19,String.valueOf(UIregistroPago.mens52));stmt.setString(20,UIregistroPago.recmens52);
            stmt.setString(21,String.valueOf(UIregistroPago.otros2));stmt.setString(22,UIregistroPago.recotros2);
            stmt.setString(23,String.valueOf(UIregistroPago.servsocial2));stmt.setString(24,UIregistroPago.recservsocial2);
            stmt.setString(25,String.valueOf(UIregistroPago.dergrado2));stmt.setString(26,UIregistroPago.recdergrado2);
            stmt.setString(27,String.valueOf(UIregistroPago.nombre2));          
            stmt.executeUpdate();
            if(stmt.executeUpdate()>0){JOptionPane.showMessageDialog(null,"Datos guardados");}
            conn.close();}       
            catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el actualizar ciclo 6

//Se crean los setter y getter
   public static int getMatriculabd() {
        return matriculabd;
    }

    public static void setMatriculabd(int matriculabd) {   
        RegistroPago.matriculabd = matriculabd;
    }

    public static int getPapeleriabd() {
        return papeleriabd;
    }

    public static void setPapeleriabd(int papeleriabd) {
        RegistroPago.papeleriabd = papeleriabd;
    }

    public static int getSegurobd() {
        return segurobd;
    }

    public static void setSegurobd(int segurobd) {
        RegistroPago.segurobd = segurobd;
    }

    public static int getPlataformabd() {
        return plataformabd;
    }

    public static void setPlataformabd(int plataformabd) {
        RegistroPago.plataformabd = plataformabd;
    }

    public static int getSimulacrobd() {
        return simulacrobd;
    }

    public static void setSimulacrobd(int simulacrobd) {
        RegistroPago.simulacrobd = simulacrobd;
    }

    public static int getMens1bd() {
        return mens1bd;
    }

    public static void setMens1bd(int mens1bd) {
        RegistroPago.mens1bd = mens1bd;
    }

    public static int getMens2bd() {
        return mens2bd;
    }

    public static void setMens2bd(int mens2bd) {
        RegistroPago.mens2bd = mens2bd;
    }

    public static int getMens3bd() {
        return mens3bd;
    }

    public static void setMens3bd(int mens3bd) {
        RegistroPago.mens3bd = mens3bd;
    }

    public static int getMens4bd() {
        return mens4bd;
    }

    public static void setMens4bd(int mens4bd) {
        RegistroPago.mens4bd = mens4bd;
    }

    public static int getMens5bd() {
        return mens5bd;
    }

    public static void setMens5bd(int mens5bd) {
        RegistroPago.mens5bd = mens5bd;
    }

    public static int getOtrosbd() {
        return otrosbd;
    }

    public static void setOtrosbd(int otrosbd) {
        RegistroPago.otrosbd = otrosbd;
    }

    public static String getRecmatriculabd() {
        return recmatriculabd;
    }

    public static void setRecmatriculabd(String recmatriculabd) {
        RegistroPago.recmatriculabd = recmatriculabd;
    }

    public static String getRecpapeleriabd() {
        return recpapeleriabd;
    }

    public static void setRecpapeleriabd(String recpapeleriabd) {
        RegistroPago.recpapeleriabd = recpapeleriabd;
    }

    public static String getRecsegurobd() {
        return recsegurobd;
    }

    public static void setRecsegurobd(String recsegurobd) {
        RegistroPago.recsegurobd = recsegurobd;
    }

    public static String getRecplataformabd() {
        return recplataformabd;
    }

    public static void setRecplataformabd(String recplataformabd) {
        RegistroPago.recplataformabd = recplataformabd;
    }

    public static String getRecsimulacrobd() {
        return recsimulacrobd;
    }

    public static void setRecsimulacrobd(String recsimulacrobd) {
        RegistroPago.recsimulacrobd = recsimulacrobd;
    }

    public static String getRecmens1bd() {
        return recmens1bd;
    }

    public static void setRecmens1bd(String recmens1bd) {
        RegistroPago.recmens1bd = recmens1bd;
    }

    public static String getRecmens2bd() {
        return recmens2bd;
    }

    public static void setRecmens2bd(String recmens2bd) {
        RegistroPago.recmens2bd = recmens2bd;
    }

    public static String getRecmens3bd() {
        return recmens3bd;
    }

    public static void setRecmens3bd(String recmens3bd) {
        RegistroPago.recmens3bd = recmens3bd;
    }

    public static String getRecmens4bd() {
        return recmens4bd;
    }

    public static void setRecmens4bd(String recmens4bd) {
        RegistroPago.recmens4bd = recmens4bd;
    }

    public static String getRecmens5bd() {
        return recmens5bd;
    }

    public static void setRecmens5bd(String recmens5bd) {
        RegistroPago.recmens5bd = recmens5bd;
    }

    public static String getRecotrosbd() {
        return recotrosbd;
    }

    public static void setRecotrosbd(String recotrosbd) {
        RegistroPago.recotrosbd = recotrosbd;
    }

    public static int getServsocialbd() {
        return servsocialbd;
    }

    public static void setServsocialbd(int servsocialbd) {
        RegistroPago.servsocialbd = servsocialbd;
    }

    public static int getDergradobd() {
        return dergradobd;
    }

    public static void setDergradobd(int dergradobd) {
        RegistroPago.dergradobd = dergradobd;
    }

    public static String getRecservsocialbd() {
        return recservsocialbd;
    }

    public static void setRecservsocialbd(String recservsocialbd) {
        RegistroPago.recservsocialbd = recservsocialbd;
    }

    public static String getRecdergradobd() {
        return recdergradobd;
    }

    public static void setRecdergradobd(String recdergradobd) {
        RegistroPago.recdergradobd = recdergradobd;
    }
public void exportapagos() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM registro_pagos");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\Pagos.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM registro_pagos");
             rs=stmt.executeQuery();
            sb.append("dia");sb.append(",");sb.append("mes");sb.append(",");sb.append("año");sb.append(",");
            sb.append("nombre");sb.append(",");sb.append("recibo");sb.append(",");sb.append("ciclo");sb.append(",");
            sb.append("valor");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append(",");
                sb.append(rs.getString(7));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar pagos   
public void exportaciclo3() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM iii");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\CicloIII.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM iii");
             rs=stmt.executeQuery();
            sb.append("nombre");sb.append(",");sb.append("matricula");sb.append(",");sb.append("rec.matricula");sb.append(",");
            sb.append("papeleria");sb.append(",");sb.append("rec.papeleria");sb.append(",");sb.append("seguro");sb.append(",");
            sb.append("rec.seguro");sb.append(",");sb.append("plataforma");sb.append(",");sb.append("rec.plataforma");sb.append(",");
            sb.append("simulacro");sb.append(",");sb.append("rec.simulacro");sb.append(",");
            sb.append("mes1");sb.append(",");sb.append("rec.mes1");sb.append(",");sb.append("mes2");sb.append(",");sb.append("rec.mes2");sb.append(",");
            sb.append("mes3");sb.append(",");sb.append("rec.mes3");sb.append(",");sb.append("mes4");sb.append(",");sb.append("rec.mes4");sb.append(",");
            sb.append("mes5");sb.append(",");sb.append("rec.mes5");sb.append(",");sb.append("otros");sb.append(",");sb.append("rec.otros");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append(",");
                sb.append(rs.getString(7));sb.append(",");
                sb.append(rs.getString(8));sb.append(",");
                sb.append(rs.getString(9));sb.append(",");
                sb.append(rs.getString(10));sb.append(",");
                sb.append(rs.getString(11));sb.append(",");
                sb.append(rs.getString(12));sb.append(",");
                sb.append(rs.getString(13));sb.append(",");
                sb.append(rs.getString(14));sb.append(",");
                sb.append(rs.getString(15));sb.append(",");
                sb.append(rs.getString(16));sb.append(",");
                sb.append(rs.getString(17));sb.append(",");
                sb.append(rs.getString(18));sb.append(",");
                sb.append(rs.getString(19));sb.append(",");
                sb.append(rs.getString(20));sb.append(",");
                sb.append(rs.getString(21));sb.append(",");
                sb.append(rs.getString(22));sb.append(",");
                sb.append(rs.getString(23));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar ciclo 3

public void exportaciclo4() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM iv");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\CicloIV.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM iv");
             rs=stmt.executeQuery();
            sb.append("nombre");sb.append(",");sb.append("matricula");sb.append(",");sb.append("rec.matricula");sb.append(",");
            sb.append("papeleria");sb.append(",");sb.append("rec.papeleria");sb.append(",");sb.append("seguro");sb.append(",");
            sb.append("rec.seguro");sb.append(",");sb.append("plataforma");sb.append(",");sb.append("rec.plataforma");sb.append(",");
            sb.append("simulacro");sb.append(",");sb.append("rec.simulacro");sb.append(",");
            sb.append("mes1");sb.append(",");sb.append("rec.mes1");sb.append(",");sb.append("mes2");sb.append(",");sb.append("rec.mes2");sb.append(",");
            sb.append("mes3");sb.append(",");sb.append("rec.mes3");sb.append(",");sb.append("mes4");sb.append(",");sb.append("rec.mes4");sb.append(",");
            sb.append("mes5");sb.append(",");sb.append("rec.mes5");sb.append(",");sb.append("otros");sb.append(",");sb.append("rec.otros");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append(",");
                sb.append(rs.getString(7));sb.append(",");
                sb.append(rs.getString(8));sb.append(",");
                sb.append(rs.getString(9));sb.append(",");
                sb.append(rs.getString(10));sb.append(",");
                sb.append(rs.getString(11));sb.append(",");
                sb.append(rs.getString(12));sb.append(",");
                sb.append(rs.getString(13));sb.append(",");
                sb.append(rs.getString(14));sb.append(",");
                sb.append(rs.getString(15));sb.append(",");
                sb.append(rs.getString(16));sb.append(",");
                sb.append(rs.getString(17));sb.append(",");
                sb.append(rs.getString(18));sb.append(",");
                sb.append(rs.getString(19));sb.append(",");
                sb.append(rs.getString(20));sb.append(",");
                sb.append(rs.getString(21));sb.append(",");
                sb.append(rs.getString(22));sb.append(",");
                sb.append(rs.getString(23));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar ciclo 4

public void exportaciclo5() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM v");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\CicloV.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM v");
             rs=stmt.executeQuery();
            sb.append("nombre");sb.append(",");sb.append("matricula");sb.append(",");sb.append("rec.matricula");sb.append(",");
            sb.append("papeleria");sb.append(",");sb.append("rec.papeleria");sb.append(",");sb.append("seguro");sb.append(",");
            sb.append("rec.seguro");sb.append(",");sb.append("plataforma");sb.append(",");sb.append("rec.plataforma");sb.append(",");
            sb.append("simulacro");sb.append(",");sb.append("rec.simulacro");sb.append(",");
            sb.append("mes1");sb.append(",");sb.append("rec.mes1");sb.append(",");sb.append("mes2");sb.append(",");sb.append("rec.mes2");sb.append(",");
            sb.append("mes3");sb.append(",");sb.append("rec.mes3");sb.append(",");sb.append("mes4");sb.append(",");sb.append("rec.mes4");sb.append(",");
            sb.append("mes5");sb.append(",");sb.append("rec.mes5");sb.append(",");sb.append("otros");sb.append(",");sb.append("rec.otros");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append(",");
                sb.append(rs.getString(7));sb.append(",");
                sb.append(rs.getString(8));sb.append(",");
                sb.append(rs.getString(9));sb.append(",");
                sb.append(rs.getString(10));sb.append(",");
                sb.append(rs.getString(11));sb.append(",");
                sb.append(rs.getString(12));sb.append(",");
                sb.append(rs.getString(13));sb.append(",");
                sb.append(rs.getString(14));sb.append(",");
                sb.append(rs.getString(15));sb.append(",");
                sb.append(rs.getString(16));sb.append(",");
                sb.append(rs.getString(17));sb.append(",");
                sb.append(rs.getString(18));sb.append(",");
                sb.append(rs.getString(19));sb.append(",");
                sb.append(rs.getString(20));sb.append(",");
                sb.append(rs.getString(21));sb.append(",");
                sb.append(rs.getString(22));sb.append(",");
                sb.append(rs.getString(23));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar ciclo 5

public void exportaciclo6() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM vi");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\CicloVI.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM vi");
             rs=stmt.executeQuery();
            sb.append("nombre");sb.append(",");sb.append("matricula");sb.append(",");sb.append("rec.matricula");sb.append(",");
            sb.append("papeleria");sb.append(",");sb.append("rec.papeleria");sb.append(",");sb.append("seguro");sb.append(",");
            sb.append("rec.seguro");sb.append(",");sb.append("plataforma");sb.append(",");sb.append("rec.plataforma");sb.append(",");
            sb.append("simulacro");sb.append(",");sb.append("rec.simulacro");sb.append(",");
            sb.append("mes1");sb.append(",");sb.append("rec.mes1");sb.append(",");sb.append("mes2");sb.append(",");sb.append("rec.mes2");sb.append(",");
            sb.append("mes3");sb.append(",");sb.append("rec.mes3");sb.append(",");sb.append("mes4");sb.append(",");sb.append("rec.mes4");sb.append(",");
            sb.append("mes5");sb.append(",");sb.append("rec.mes5");sb.append(",");sb.append("otros");sb.append(",");sb.append("rec.otros");sb.append(",");
            sb.append("servsocial");sb.append(",");sb.append("rec.servsocial");sb.append(",");sb.append("dergrado");sb.append(",");sb.append("rec.dergrado");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append(",");
                sb.append(rs.getString(7));sb.append(",");
                sb.append(rs.getString(8));sb.append(",");
                sb.append(rs.getString(9));sb.append(",");
                sb.append(rs.getString(10));sb.append(",");
                sb.append(rs.getString(11));sb.append(",");
                sb.append(rs.getString(12));sb.append(",");
                sb.append(rs.getString(13));sb.append(",");
                sb.append(rs.getString(14));sb.append(",");
                sb.append(rs.getString(15));sb.append(",");
                sb.append(rs.getString(16));sb.append(",");
                sb.append(rs.getString(17));sb.append(",");
                sb.append(rs.getString(18));sb.append(",");
                sb.append(rs.getString(19));sb.append(",");
                sb.append(rs.getString(20));sb.append(",");
                sb.append(rs.getString(21));sb.append(",");
                sb.append(rs.getString(22));sb.append(",");
                sb.append(rs.getString(23));sb.append(",");
                sb.append(rs.getString(24));sb.append(",");
                sb.append(rs.getString(25));sb.append(",");
                sb.append(rs.getString(26));sb.append(",");
                sb.append(rs.getString(27));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar ciclo 6
    public void eliminaciclo3(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from iii");
              stmt.executeUpdate();
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 3
 
    public void eliminaciclo4(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from iv");
              stmt.executeUpdate();
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 3
    
    public void eliminaciclo5(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from v");
              stmt.executeUpdate();
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 3
    
    public void eliminaciclo6(){//Crea al estudiante en ciclo 3
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from vi");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null, "Se elimina las tablas de Ciclo III,IV,V,VI");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra el crear ciclo 6
    
    public void eliminapagos(){//Resetea tabla pagos
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from registro_pagos");
              stmt.executeUpdate();
              JOptionPane.showMessageDialog(null, "Se elimina las tablas de Ingresos y Gastos");
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra eliminar
}//Cierra registro pago
