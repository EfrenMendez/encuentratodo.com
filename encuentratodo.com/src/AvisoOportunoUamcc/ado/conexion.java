

package AvisoOportunoUamcc.ado;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
	
	private static Connection connection=null;
	
	public Connection getConexion(){
	
		if(connection==null){
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/encuentratodo.com";
            connection = DriverManager.getConnection(url, "root", "efren");
				
				System.out.println("Obteniendo conexion de mysql.....");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return connection;
	}

}