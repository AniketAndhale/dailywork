import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class Database2 {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter id");
	int id=Integer.parseInt(sc.nextLine());
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter salary");
	long salary=Integer.parseInt(sc.nextLine());
	
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="anvi@1997";
		Connection conn =DriverManager.getConnection(url,username,password);
		String query="insert into sai values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setLong(3,salary);
		int result=ps.executeUpdate();
		if(result>0)
		{
			System.out.println("inserted");
		}
		else
		{
			System.out.println("try");
		}

}
}
