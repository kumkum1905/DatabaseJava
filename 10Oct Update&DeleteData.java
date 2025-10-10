/*
10 Oct 2025:

4 Op:
C-> CREATE/INSER -> change the table -> executeUpdate()
R-> READ/RETRIVE -> executequery()
U-> UPDATE -> change the table -> executeUpdate()
D-> DEL -> change the table -> executeUpdate()

1. create table from Orcael
2. update the code given below

*/
import java.sql.* ;

class insertDATA{ 
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Load Driver Class
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Create connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");

		
		//Query Need to be run

		//insert
		//String SQLcmd = "insert into STUDENT values(69,'sidhu','ECE')";

		//update
		String SQLcmd = "update STUDENT set name="sidhu" where rollno=27";

		//delete 
		//String SQLcmd = "delete from  STUDENT where rollno=10";


		//Creating Statement
		Statement st = con.createStatement();

		//Send and Execute the Query
		int n = st.executeUpdate(SQLcmd);

		//Check For Query Execution
		if(n<0) System.out.println("Try Again");
		else System.out.println("Table Updated");

		//close connection
		con.close();
	}
}
