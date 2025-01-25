import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		int  sum = 1;
		for (int i=2;i<n;i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n)
			System.out.println("True");
		else
			System.out.println("False");				
	}

}
