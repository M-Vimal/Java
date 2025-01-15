import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner getTableNumber = new Scanner(System.in);
		
		System.out.print("Enter The Table Number :");
		
		int tableNumber = getTableNumber.nextInt();
		System.out.println("Multiplication Table From 1 to :");
		int n = getTableNumber.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println(i+" x "+tableNumber+" = " + i*tableNumber);
		}
	}

}
