import java.sql.*;
import java.util.Scanner;

class UserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        // Load Oracle JDBC Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");

        // User input
        System.out.print("Enter Student ID (int): ");
        int id = sc.nextInt(); 

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Student Branch: ");
        String course = sc.next();

        // Insert SQL command with placeholders
        String SQLcmd = "insert into STUDENT values(" +id+ ",'" +name+ "','" +course+ "')";

	//Creating Statement
	Statement st = con.createStatement();

	//Send and Execute the Query
	int n = st.executeUpdate(SQLcmd);

	//Check For Query Execution
	if(n<0) System.out.println("Try Again");
	else System.out.println("Table Updated");

	//Send and Execute the Query
 	SQLcmd = "select * from STUDENT" ;
	ResultSet rs = st.executeQuery(SQLcmd);

	while(rs.next()){
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
	}
        

        // Close resources
        con.close();

    }
}
