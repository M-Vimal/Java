
public class MaximumOfTwoNumbers {
	
	
	
	public int findMax(int a,int b){
		if (a > b){
			return a;
			
		}
		else {
			return b;
	}
	}
	
	public double findMax(double a,double b){
		if (a > b){
			return a;
			
		}
		else {
			return b;
	}
	}
	

	public static void main(String[] args) {
		MaximumOfTwoNumbers n1 = new MaximumOfTwoNumbers();
		
		double a = n1.findMax(4.3,6.7);
		System.out.println(a);
		

	}

}
