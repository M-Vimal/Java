interface Payment{
	void pay(double amount);
}


class CreditCardPayment implements Payment{
	public void pay(double amount) {
		System.out.println(amount + " received through CreditCardPayment");
		
	}
}


class UPIPayment implements Payment{
	public void pay(double amount) {
		System.out.println(amount + " received through UPIPayment");
		
	}
}

public class LaunchPayment {

	public static void main(String[] args) {
		Payment cp = new CreditCardPayment();
		Payment upi = new UPIPayment();
		cp.pay(100);
		upi.pay(100);

		

	}

}
