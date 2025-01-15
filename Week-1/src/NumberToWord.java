import java.util.Scanner;
public class NumberToWord {

	public static void main(String[] args) {
		String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number ");
		
		int number = scanner.nextInt();
		
		if (number >= 0 && number <= 9 )
			System.out.println("The number in Word is " + words[number] );
		else
			System.out.println("Please Enter a  Number From 0 to 9");
		

	}

}
