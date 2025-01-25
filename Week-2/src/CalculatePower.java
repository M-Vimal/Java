
public class CalculatePower {
	
	public static int calcPower(int base,int exponent) {
		int res = 1;
		for (int i=0;i<exponent;i++) {
			res *= base;
		}
		return res;
	}
	public static double calcPower(double base,int exponent) {
		int res = 1;
		for (int i=0;i<exponent;i++) {
			res *= base;
		}
		return res;
	}
	public static double calcPower(double base,double exponent) {
		int res = 1;
		for (int i=0;i<exponent;i++) {
			res *= base;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(calcPower(4,5));
		System.out.println(calcPower(4.5,5.5));
		System.out.println(calcPower(4.5,5));
	}

}
