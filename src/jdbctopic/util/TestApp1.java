package jdbctopic.util;

import java.sql.Connection;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Connection conn1 = DBConnection.getDbInstance();
		System.out.println("In Main Db Connection oobject conn1 : " + conn1);

		Connection conn2 = DBConnection.getDbInstance();
		System.out.println("In Main Db Connection oobject conn2 : " + conn2);
		
		Connection conn3 = DBConnection.getDbInstance();
		System.out.println("In Main Db Connection oobject conn3 : " + conn3);
		
		Connection conn4 = DBConnection.getDbInstance();
		System.out.println("In Main Db Connection oobject conn4 : " + conn4);

		Connection conn5 = DBConnection.getDbInstance();
		System.out.println("In Main Db Connection oobject conn5 : " + conn5);
	}
}
