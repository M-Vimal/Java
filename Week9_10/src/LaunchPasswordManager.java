import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class LaunchPasswordManager {
	
	public static void addPassword(String username,String pwd) {
		try(FileWriter writer = new FileWriter("TextFiles/password.txt",true))
		{
			writer.write("username - "+username+" ; "+" password - "+pwd);
			writer.write("\n");
			System.out.println("password saved successfully");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	//retrieve passwords
	public static void retrievePasswords() {
		try(BufferedReader reader = new BufferedReader(new FileReader("TextFiles/password.txt"))){
			String line;
			System.out.println("stored passwords");
			while((line=reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Password Manager");
		while(true) {
			System.out.println("1. Add password \n2. Show Password \n3. Exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
	            System.out.print("Enter username: ");
	            String username = scanner.nextLine();
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();
	            addPassword(username, password);
	            break;
			case 2:
				retrievePasswords();
	            break;
			case 3:
	            System.out.println("Exit Successful");
	            scanner.close();
	            System.exit(0);
	        default:
	        	System.out.println("invalid choice");
			
			}
			
		}
		


	}

}
