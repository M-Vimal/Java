import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {	
		Scanner get_number = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = get_number.nextInt();
		
		
		int ans = 1;
		for (int i=1;i<=n;i++) {
			ans *= i;	
		}
		System.out.println(ans);
		get_number.close();
	}

}
