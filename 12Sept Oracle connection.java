/*
1. open orcale 10g and login(username: system and password: system )
	DataBase Name is XE

2. Oracle(XE) is ready now connect it with java
use orcale connector in "....jdbc/lib/filename"

we need to set the classpath : system env
use: ;.; in the end 

3. start-> edit sys var -> Env Var -> New -> (Fill the field according [Name , Path])
Path: C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib/(filename with extension)

4. Write code of java show below
*/

import java.sql.* ;

class DB{
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Load Driver Class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");

		System.out.println(con);

		//close connection
		con.close();
	}
}
