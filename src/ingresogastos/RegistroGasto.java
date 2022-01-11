
package ingresogastos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegistroGasto {
   String dir="jdbc:mysql://localhost:3306/colboston", usr="root",pwd="1997";
    public void crearConexion(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("INSERT INTO registro_gastos VALUES (?,?,?,?,?,?)");
              stmt.setInt(1,UIingresoGasto.dia2);
              stmt.setInt(2,UIingresoGasto.mes2);
              stmt.setInt(3,UIingresoGasto.anio2);
              stmt.setString(4,UIingresoGasto.concepto2);
              stmt.setInt(5,UIingresoGasto.valor2);
              stmt.setString(6,UIingresoGasto.descripcion2);
              stmt.executeUpdate();
              ResultSet rs = stmt.executeQuery("select * from registro_gastos");
              JOptionPane.showMessageDialog(null,"Datos guardados");
              conn.close();
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra crear conexión
    
    public void exportagastos() throws FileNotFoundException{//Para exportar a archivo csv
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM registro_gastos");
             PrintWriter pw= new PrintWriter(new File("C:\\Users\\fblum\\Gastos.csv"));
             StringBuilder sb=new StringBuilder();                                              
             ResultSet rs = stmt.executeQuery("SELECT * FROM registro_gastos");
             rs=stmt.executeQuery();
            sb.append("dia");sb.append(",");sb.append("mes");sb.append(",");sb.append("año");sb.append(",");
            sb.append("concepto");sb.append(",");sb.append("valor");sb.append(",");sb.append("descripcion");sb.append("\r\n");
             while(rs.next()){
                sb.append(rs.getString(1));sb.append(","); 
                sb.append(rs.getString(2));sb.append(",");
                sb.append(rs.getString(3));sb.append(",");
                sb.append(rs.getString(4));sb.append(",");//Saca los datos de la tabla
                sb.append(rs.getString(5));sb.append(",");
                sb.append(rs.getString(6));sb.append("\r\n");}//Cierra while
             pw.write(sb.toString());
        pw.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Datos exportados");
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra exportar gastos
    
    public void eliminagastos(){//Resetea tabla pagos
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection(dir,usr,pwd)) {
              PreparedStatement stmt = conn.prepareStatement("Delete from registro_gastos");
              stmt.executeUpdate();
              conn.close();}       
             } catch (ClassNotFoundException | SQLException e) {System.out.println(e);  }}//Cierra eliminar
}
