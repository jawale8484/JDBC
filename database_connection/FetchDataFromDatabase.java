package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.mysql.jdbc.Statement;

public class FetchDataFromDatabase {

	public FetchDataFromDatabase() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login_user","root","root");
			Statement st=(Statement) conn.createStatement();
			System.out.println("Records in database are-->");
			ResultSet rs=st.executeQuery("Select * from userinfo");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Error :-"+e);
		}
		
	}

}
