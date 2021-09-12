
package ingresogastos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Registro {
   
    public void crearConexion(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/colboston","root","cronoalgea97")) {
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
              
          }          
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e);}//Cierra catch
                                 }//Cierra crear conexión
}

