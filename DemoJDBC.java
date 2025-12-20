// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.sql.*;

public class DemoJDBC {
//    public Demo() {
//    }

   public static void main(String[] args) {
    // MYDB is the Database name
      String host = "jdbc:mysql://localhost:3306/MYDB";
      String username = "root"; //username
      String password = ""; //password

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        //  we are making connection with MYSQL
         Connection con = DriverManager.getConnection(host, username, password);
         System.out.println("Connected Successfully!");
         Statement stmt = con.createStatement();

        //  String sql = "CREATE TABLE STUDENT(ID INT PRIMARY KEY,NAME varchar(100),AGE INT)";
        //  stmt.execute(sql);
        //  System.out.println("Table CREATED !!!");
        // //  String. - char - fixed length char(10)-phone no , pincode 110043


        // String sql1 = "insert into student values(101,'Amit',15),(102,'Tanu',16),(103,'Akash',14),(104,'Naina',15)";
        // stmt.execute(sql1);
        // System.out.println("Data Inserted ✅");
        // ,varchar - small text
        // ,text - large text

        ResultSet rs = stmt.executeQuery("Select * from student");
        // Meta means data(info) about data(sql table)
        ResultSetMetaData obj = rs.getMetaData();
        int colCount = obj.getColumnCount();
        System.out.println(colCount);
        for (int i=1;i<=colCount;i++)
        {
            // escape sequence - tab
            System.out.print(obj.getColumnName(i) +"\t");
        }
        System.out.println("\n--------------------");
        // System.out.println("ID  |  Name  |  Age");
        while(rs.next())
        {
            System.out.println(rs.getInt("id") + "\t|"+ rs.getString("name")+"\t|"+
        rs.getInt("age") );
        System.out.println("--------------------");


        }
        // con.close();

      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }
}
