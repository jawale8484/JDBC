//program for connect to database

package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login_user","root","root");
			
			if(conn!=null) {
				System.out.println("Connected Successfully to database");
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Sorry..Not connected to database");
			System.out.println(e);
		}

	}

}
