package JDBCProject;
import java.sql.*;
import java.sql.DriverManager;



public class Example {

	static final String JDBC_DRIVER = "com.mysql.jdbc.driver";
	static final String DB_URL ="jdbc:mysql://localhost/employee";
	
	//Database credentials
	static final String user="root";
	static final String pass="";
	
	
	public static void main(String[] args)
	{
		Connection conn=null;
		Statement stmt=null;
		
		try {
			//Step 2: Register JDBC driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step  3: Open a connection 
			System.out.println("Connecting to database");
			conn=DriverManager.getConnection(DB_URL,"root","");
			
			
			//Step 4 : Execute a query 
			System.out.println("Creating statement ...");
			stmt=conn.createStatement();

			String sql= "CREATE TABLE REGISTRATION " + 
			"(id INTEGER not null, " +
			"first VARCHAR(255), " +
			"last VARCHAR(255), " +
			"age INTEGER, " +
			" PRIMARY KEY (id))";
			
			stmt.executeUpdate(sql);
			
		ResultSet  rs=stmt.executeQuery(sql);
		
		//Step 5 : Extract data from result set 
		while(rs.next()) {
			//Retrieve by column name 
			int id=rs.getInt("id");
			int age=rs.getInt("age");
			String first=rs.getString("first");
			String last = rs.getString("last");
			
			//Display Values 
			System.out.print("ID: "+id);
			System.out.print(", age "+age);
			System.out.print(", first "+first);
			System.out.println(", last "+last);
			}
			
		//Step 6 : Clean Up environment 
		rs.close();
		stmt.close();
		conn.close();
}catch(SQLException se) {
	//Handle error for JDBC
	se.printStackTrace();
}catch(Exception e) {
	//handle errors for Class.forName()
	e.printStackTrace();
}finally {
	//finally block to close resources 
	

		try {
			if(conn!=null) 
				conn.close();
		}
			catch(SQLException se) {
			se.printStackTrace();
		}//end finally try
		}//end try
	
	System.out.println("Goodbye");
}//end main
	
}//end example 
