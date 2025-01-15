import java.util.Scanner;


public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner get_n = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = get_n.nextInt();
		int sum = 0;
		for (int i=1;i<=n;i++){
			sum += i;
		}
		System.out.println(sum);
		get_n.close();

	}

}
