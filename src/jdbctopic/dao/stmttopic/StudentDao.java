package jdbctopic.dao.stmttopic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
	
	public int update() 
	{
		int rowsAffected = 0 ;
		Statement stmt = null;
		
		String updateQuery = "UPDATE student SET name='Krunal Shah' , std=12 , marks=90 WHERE rno=2";
		
		Connection conn = DBConnection.getDbInstance();
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not conncted");
		}
		return rowsAffected;

	}
	public int delete(int rno) 
	{
		int rowsAffected = 0 ;
		Statement stmt = null;
		
		String deleteQuery = "DELETE FROM student WHERE rno = "+rno;
		
		Connection conn = DBConnection.getDbInstance();
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not conncted");
		}
		return rowsAffected;
	}
	public void getAllRecords() 
	{
		String selectQuery ="SELECT * FROM student";
		
		Connection conn = DBConnection.getDbInstance();
		
		Statement stmt=  null;
		
		ResultSet rs = null;
		
		
		if (conn!=null) 
		{
			try 
			{
				stmt=  conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
			
				while(rs.next()) 
				{
					int rno  = rs.getInt(1);
					String name = rs.getString(2);
					int std  = rs.getInt(3);
					int marks  = rs.getInt(4);
					
					System.out.println(rno +" "  + name + " "+std + " " +marks);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected");
		} 
	}
	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();
		
		
		dao.getAllRecords();
		
		
//-------------------------------------------------------------------------------		
//		StudentDao dao = new StudentDao();
//		int rowAffected = dao.update();
//		
//		if(rowAffected > 0) 
//		{
//			System.out.println("Student record successfully Updated : " + rowAffected);
//		}else
//		{
//			System.out.println("Student record not Updated : " + rowAffected);
//		}
//-------------------------------------------------------------------------------		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Rno : ");
//		int rno = sc.nextInt();
//		
//		StudentDao dao = new StudentDao();
//		
//		int rowAffected = dao.delete(rno);
//		
//		if(rowAffected > 0) 
//		{
//			System.out.println("Student record successfully Deleted : " + rowAffected);
//		}else
//		{
//			System.out.println("Student record not Deleted : " + rowAffected);
//		}
//-------------------------------------------------------------------------------		
//		StudentDao dao = new StudentDao();
//		int rowAffected = dao.insert();
//		if(rowAffected > 0) 
//		{
//			System.out.println("Student record successfully Inserted : " + rowAffected);
//		}else
//		{
//			System.out.println("Student record not Inserted : " + rowAffected);
//		}
	}
}
