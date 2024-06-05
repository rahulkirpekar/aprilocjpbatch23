package jdbctopic.dao.stmttopic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctopic.util.DBConnection;

// StudentDao---[Student Table]
public class StudentDao 
{
	public int insert() 
	{
		int rowAffected = 0;
		
		Statement stmt = null;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('Rahul Kirpekar',12,90)";
		
		Connection conn = DBConnection.getDbInstance();
		
		if(conn != null) 
		{
			// process
			try 
			{
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			}catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}else 
		{
			System.out.println("StudentDao :: insert() --- Db not connected");
		}
		return rowAffected;
	}
	
	public void update() 
	{

	}
	public void delete() 
	{

	}
	public void getAllRecords() 
	{

	}
	
	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();
		
		int rowAffected = dao.insert();
		
		if(rowAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowAffected);
		}else
		{
			System.out.println("Student record not Inserted : " + rowAffected);
		}
	}
}
