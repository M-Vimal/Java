import java.sql.*;



public class LaunchDress {
	private static String url = "jdbc:mysql://localhost:3306/student";
	private static String root = "root";
	private static String pwd = "12345";

	public static void main(String[] args) throws SQLException {
		
		String query1 = "insert into dress_details(dress_name,size,price) values (?,?,?)";

		
		Connection con = DriverManager.getConnection(url, root, pwd);
		
		
		
		PreparedStatement ps = con.prepareStatement(query1);
		
		ps.setString(1, "T-Shirt");
		ps.setString(2, "xl");
		ps.setDouble(3, 299.0);
		ps.addBatch();
		
        ps.setString(1, "Jeans");
        ps.setString(2, "L");
        ps.setDouble(3, 999.99);
        ps.addBatch(); 

        ps.setString(1, "Jacket");
        ps.setString(2, "XL");
        ps.setDouble(3, 1999.99);
        ps.addBatch(); 

        ps.setString(1, "Sweater");
        ps.setString(2, "S");
        ps.setDouble(3, 799.99);
        ps.addBatch();
        
        int[] row = ps.executeBatch();
        
        for(int i:row) {
        	if(i>0) {
        		continue;
        	}
        	else {
        		con.rollback();
        	}
        }
        
        System.out.println("success");

	}

}
