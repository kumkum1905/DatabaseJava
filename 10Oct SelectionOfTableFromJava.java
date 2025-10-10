/*
10 Oct 2025:

4 Op:
C-> CREATE/INSER -> change the table -> executeUpdate()
R-> READ/RETRIVE -> executequery()
U-> UPDATE -> change the table -> executeUpdate()
D-> DEL -> change the table -> executeUpdate()

1. create table from Orcael
2. update the code given below

next() -> to send the pointer to the next point -> it return the boolean type
TYPE get(col no/col name) -> return TYPE 
that is getInt() getString()   

*/
import java.sql.* ;

class Query{ 
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Load Driver Class
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Create connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");

		
		//Seletcion of Query
		String SQLcmd = "select * from STUDENT" ;

		//Creating Statement
		Statement st = con.createStatement();

		//Send and Execute the Query
		ResultSet rs = st.executeQuery(SQLcmd);

		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
		}

		//close connection
		con.close();
	}
}
