import java.util.Scanner;

public class ToCheckPerfectSquareOrNot {

	public static void main(String[] args) {
		Scanner get_number = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = get_number.nextInt();
		
		for (int i=1;i<=n;i++) {
			int val = i*i;
			if(val == n) {
				System.out.println(n+" is a perfect square");
				break;
			}
			else if(val > n) {
				System.out.println(n+" is not a perfect square");
				break;
			}
				
					
		}

	}

}
