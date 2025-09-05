/*
5 SEPT 2025 -> connection maing
data -> file -> Database
Need manager to maintain the DB. EG: orcale,MySQL.
.java -> use for business logic (How u wanna Process data)

1. connect the data
2. send query from java file
3. Manager handles the Query
4. Get response from the manager

DB -> collection of File
Relational DB -> if file in the form of the table (2D structure) then DB is called Realtion DB

MySQL:
1. Workbench: GUI based
2.Xampp Server: Gui based (browser based)

Lets use Xampp Server
1. Open Xampp control pannel -> DB manager
Apache -> (web server) -> start
MySQL - > start

to start a server we use localhost -> 
Apache -> localhost/dashboard 
MySql -> click on phpmyadmin (COMPLETE GUI BASED)

2. CONNECTING:
search Sql Connector: Download JDBC connector
download platform indepedent zip file without login 
extract it and find .jar file (jar -> java archive ->compressed file)

3.SET CLASS PATH OF JAR PATH
Set env variable to System or User Variable as per your Requirement of jar file 
end with -> ;.; ->for current DIR

4. MAking java file (Code is below)
*/

import java.sql.* ;

class db{
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		//Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/3csds","root","");

		System.out.println(con);

		//close connection
		con.close();
	}
}
































