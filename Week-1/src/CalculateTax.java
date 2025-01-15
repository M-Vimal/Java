public class CalculateTax {
	public static void main(String[] args) {
		int income = 310000;
		double taxrate = 2.2;
		double tax = income * taxrate / 100;
		System.out.println(tax);
		
		
		//System.out.println(userIncome());

	}
	
	
	// For Differnent UserIncomes
	// import java.util.Scanner;
	
	
	/*
	public static double userIncome() {
		Scanner get_income = new Scanner(System.in);
		System.out.print("Enter your Income:");
		
		int income = get_income.nextInt();
		System.out.print("Enter your Taxrate:");
		
		double taxrate = get_income.nextDouble();
		
		double tax = income * taxrate / 100;
		return tax;
	}
	*/

}
