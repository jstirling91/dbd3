import java.sql.* ;
import com.ibm.db2.jcc.*;

public class database {
	
	private static Connection con;
	//These variables may need to change depending on your mySQL configurations 
	private static String url = "jdbc:db2://db2:50000/cs421";
	private static String driver = "com.ibm.db2.jcc.DB2Driver()";
	private static String userName = "cs421g02"; 
	private static String password = "[$2014g02";
	
//	public database(){
//		try {
//		    DriverManager.registerDriver ( new com.ibm.db2.jcc.DB2Driver() ) ;
//		    String url = "";
//			Connection con = DriverManager.getConnection (url,"cs421g02","[$2014g02");
//			Statement statement = con.createStatement ( ) ;
//		} catch (Exception cnfe){
//		    System.out.println("Class not found");
//	     }
//	}
	
	private static void connect(){
		 try {
			 DriverManager.registerDriver ( new com.ibm.db2.jcc.DB2Driver() ) ;
//			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void option1(){
		try {
			connect();
		    String querySQL = "select l.name, avg(r.OverallRating) as average from reviews r, LocationReview lr, location l where lr.rid=r.rid and lr.lid=l.lid group by l.name order by avg(r.OverallRating) desc";
		    Statement statement = con.createStatement();
		    java.sql.ResultSet rs = statement.executeQuery ( querySQL ) ;
		    while ( rs.next ( ) ) {
				String name = rs.getString (1);
				String average = rs.getString (2);
				System.out.print ("name:  " + name);
				System.out.print("\taverage:  " + average);
		    }
		    System.out.println ("DONE");
		} catch (SQLException e)
		    {
			e.printStackTrace();
//			sqlCode = e.getErrorCode(); // Get SQLCODE
//			sqlState = e.getSQLState(); // Get SQLSTATE
	                
			// Your code to handle errors comes here;
			// something more meaningful than a print would be good
//			System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
		    }
	}
}
