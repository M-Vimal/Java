import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle ;
		double rate;
		double amount;
		int year;
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter principle:");
		principle = scanner.nextDouble();
		System.out.println("Enter rate:");
		rate = scanner.nextDouble();
		System.out.println("Enter years:");
		year = scanner.nextInt();
		
		amount = principle * Math.pow((1+rate/100),year);
		System.out.println("The intrest is :" + amount);

	}

}
