package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
 
public class InsertDataToDatabase {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login_user","root","root");
			String s="insert into userinfo values(10,'Komal Waghulade')";
			

		//	conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteler","root","root");
		//	String s="insert into userinfo values('vaibhav','jawale','vjawale@g.com',84849,'pune')";
			
			
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(s);
			//PreparedStatement ps=(PreparedStatement) conn.prepareStatement("Insert Into 'login_user'.'logininfo'.('UserId','UserName') values(1,'vaibhav jawale');");
			
			
			int status=ps.executeUpdate();
			
			
			if(status!=0) {
				System.out.println("Connected Successfully to database");
				System.out.println("Data inserted successfully.");
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Sorry..Something wents wrong to insert data into database..!");
			System.out.println(e);
		}

	}

}
