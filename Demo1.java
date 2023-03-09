import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Search extends Frame implements ActionListener
{
  Label l1;
  TextField t1,t2;
  Button b;
  Search()
  {
      setSize(500,500);
      setVisible(true);
      setLayout(new FlowLayout());
      l1=new Label("Enter roll number");
      t1=new TextField(20);
      t2=new TextField(30);
      b=new Button("Search");
      add(l1);
      add(t1);
      add(b);
      b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     PreparedStatement p=c.prepareStatement("select * from bhavyaa where eid=?");
     String num=t1.getText();
     p.setString(1,num);
     ResultSet rs=p.executeQuery();
     int x=0;
     add(t2);
      while(rs.next())
      {
     //Display name on  textfeild
       t2.setText(rs.getString(2));
       x++;
      }
      if(x==0)
         t2.setText("record not found");
    }
    catch(Exception ex)
    {
      System.out.println(ex);
    }
}
}
class Demo1
{
  public static void main(String args[])
 {
      Search s=new Search();
 }
}


 




