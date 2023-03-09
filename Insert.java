import java.sql.*;
class Insert
{
  public static void main(String args[])
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver registered");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     Statement s=c.createStatement();
     String sql="insert into bhavyaa values(11,'honey')";
      s.executeUpdate(sql);
     
     String sql1="insert into bhavyaa values(12,'hone')";
      s.executeUpdate(sql1);
    
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
