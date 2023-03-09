import java.sql.*;
class Update
{
  public static void main(String args[])
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver registered");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     Statement s=c.createStatement();
     String sql="update bhavyaa set eid=15 where ename='honey'";
      s.executeUpdate(sql);
     
     
    
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
