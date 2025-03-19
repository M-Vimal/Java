import java.sql.*;
import java.util.Scanner;


public class Student {
	private static String url = "jdbc:mysql://localhost:3306/student";
	private static String root = "root";
	private static String pwd = "12345";
	
	public static void readRecord(Connection con) throws SQLException {
		String query = "select * from student_details";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("student details");
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
		}
	}
	
	
	
	public static void insertRecord(Connection con) throws SQLException{
		String name;
		int age;
		
		//get input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student name");
		name = scanner.next();
		System.out.println("enter student age");
		age = scanner.nextInt();
		
		
		//create query using 
		String query = "insert into student_details(name,age) values (?,?)";
		
		
		//insert query using preparedstatement
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,name);
		ps.setInt(2, age);
		
		int row = ps.executeUpdate();
		System.out.println("number of rows affected:"+row);
				
	}
	
	
	public static void updateRecord(Connection con) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student id to update");
		int s_id = scanner.nextInt();
		System.out.println("enter student age");
		int age = scanner.nextInt();
		
		
		//create query using 
		String query = "update student_details set age = ? where id = ?";
		
		
		//insert query using preparedstatement
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, age);	
		ps.setInt(2, s_id);
		int row = ps.executeUpdate();
		System.out.println("number of rows updated:"+row);
		
	}
	
	
	public static void deleteRecord(Connection con) throws SQLException{
		
		//get input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student id to delete");
		int s_id = scanner.nextInt();
		
		
		//create query using 
		String query = "delete from student_details where id = ?";
		
		
		//insert query using preparedstatement
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, s_id);
		int row = ps.executeUpdate();
		System.out.println("number of rows deleted:"+row);
	}

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);

		
		Connection con = DriverManager.getConnection(url, root, pwd);
		
		
		while(true) {	
			System.out.println("CRUD operation \n1.show detail \n2.update record \n3.insert record \n4.deleterecord \n5.exit");
			System.out.println("enter option");
			int choice = scanner.nextInt();
			
			if(choice == 1) {				
				readRecord(con);
			}
			else if(choice == 2){
				updateRecord(con);
			}
			else if(choice == 3){
				insertRecord(con);
	
			}
			else if(choice == 4){
				deleteRecord(con);
			}
			else if(choice == 5) {
				System.out.println("exit");
				break;
			}
			else {
				System.out.println("invalid choice");
			}
			}
		

}
}
