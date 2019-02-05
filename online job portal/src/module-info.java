import java.sql.*;  
class job{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:8889/studentsignup","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from signup");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.String(4)+" "+rs.String(5)+" "+rs.String(6)+" "+rs.String(7)"");
//stmt.executeUpdate("Insert into signup (name,id,branch,college,degree,country,nationality) values ('nikhil',333333,'CSE','saveetha','BE','india','hindu')");
//stmt.executeUpdate("Delete from signup where student_name = 'test'");
//stmt.executeUpdate("Insert into signup (name,id,branch,college,degree,country,nationality) values ('ashok',333331,'eee','saveetha','BE','india','hindu')");
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
} 