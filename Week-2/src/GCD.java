import java.util.Scanner;
import java.math.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number1 ");
		int n = scanner.nextInt();
		System.out.println("enter a number2 ");
		int m = scanner.nextInt();
		int res=0;
		
		for(int i = 1;i<Math.max(m,n);i++) {
			if (m%i == 0 && n % i==0) {
				res = Math.max(res, i);
			}
		}
		
		System.out.println(res);

	}

}
