package jdbctopic.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection 
{
	// 1) Make credentials
//	private static final String URLNAME      = "jdbc:mysql://localhost:3306/aprilbatch";
//	private static final String DRIVERCLASS  = "com.mysql.cj.jdbc.Driver";
//	private static final String USERNAME     = "root";
//	private static final String PASSWORD	 = "root";
	
	private static Connection conn = null;
	
	private DBConnection()
	{
	}
	public static Connection getDbInstance() 
	{
		if(conn == null) 
		{
			conn = DBConnection.getDBConnection();  
		}
		return conn;
	}
	// 2) create getDBConnection method
	private static Connection getDBConnection() 
	{
		Properties prop =  new Properties();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\aprilocjpbatch23\\dbconfig.properties");

			prop.load(fin);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		String urlName    = prop.getProperty("URLNAME").trim();
		String driverClass= prop.getProperty("DRIVERCLASS").trim();
		String userName    = prop.getProperty("USERNAME").trim();
		String password    = prop.getProperty("PASSWORD").trim();
		
		
		try 
		{
			// 3) Load Driver class
			Class.forName(driverClass);
			
			// 4) pass credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(urlName, userName, password);

			// 5) validate connection object
			if(conn != null) 
			{
//				System.out.println("Db connected : " + conn);
			}else 
			{
				System.out.println("Db not connected : " + conn);
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	
}