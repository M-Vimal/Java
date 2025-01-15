import java.util.Scanner;
public class Odd_Or_Even {

	public static void main(String[] args) {
		Scanner get_number = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = get_number.nextInt();
		
		if (number % 2 == 0)
			System.out.println(number +" is a Even Number");
		else
			System.out.println(number +" is a Odd Number");
			
		get_number.close();
	}

}
