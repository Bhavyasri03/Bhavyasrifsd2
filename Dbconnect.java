import java.sql.*;
class Dbconnect
{
  public static void main(String args[])
{
  try
 {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  System.out.println("Driver Registered");
  Connection c= DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
  System.out.println("Established");
  Statement stmt=c.createStatement();
  String sql="create table honey(eid integer primary key,ename varchar(40))";
  stmt.execute(sql);
  System.out.println("Table created");
}
 catch(Exception e)
 {
   System.out.println(e);
 }
}
}