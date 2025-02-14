import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Customer {
	String name;
	int age;
	int accountNumber;

	public Customer(String name, int age, int accountNumber) {
		this.name = name;
		this.age = age;
		this.accountNumber = accountNumber;
	}

	public String toString() {
		return "Customer{name='" + name + "', age=" + age + ", accountNumber=" + accountNumber + "}";
	}
}

class Branch {
    int branchName;
    List<Customer> customers;

    public Branch(int branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

	public void addCustomer(Customer customer) {
	         customers.add(customer);
    }
    // Method to display branch details
    public void displayDetails() {
        System.out.println("  Branch Number: " + branchName);
        for (Customer customer : customers) {
            System.out.println("    " + customer);
        }
    }
	
		
	}
	
	class Bank {
		int bankName;
		List<Branch> branches;
	
		public Bank(int bankName) {
			this.bankName = bankName;
			this.branches = new ArrayList<>();
		}
	
		public void addBranch(Branch branch) {
			branches.add(branch);
		}
	
		public List<Branch> getBranches() {
			return branches;
		}
	
		public void displayDetails() {
		System.out.println("Bank Number: " + bankName);
			for (Branch branch : branches) {
				branch.displayDetails();
        }
    }
}
public class LaunchBank {

	static int[] banks = { 1, 2, 3 };
	String[] details = {};

	public static List<Bank> branchDetails() {
		Scanner scanner = new Scanner(System.in);
		List<Bank> banks = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			Bank bank = new Bank(i);
			int branch;
			System.out.println("How many branch you have for bank number " + i);
			branch = scanner.nextInt();
			scanner.nextLine();
			for (int j = 1; j <= branch; j++) {
				Branch b = new Branch(j);
				System.out.println("How many customers do you have in " + j + "branch");
				int cus = scanner.nextInt();
				scanner.nextLine();
				System.out.println("please enter your details");
				for (int k = 0; k < cus; k++) {
					System.out.println("enter your name:");
					String name = scanner.nextLine();
					System.out.println("enter your age");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("enter your account number");
					int acc_no = scanner.nextInt();
					scanner.nextLine();
					Customer customer = new Customer(name, age, acc_no);
					b.addCustomer(customer);
				}
				bank.addBranch(b);
			}
			banks.add(bank);	
		}
		scanner.close();
		return banks;
	}

	public static void main(String[] args) { 
 		List<Bank> banks = branchDetails();
		for (Bank bank : banks) {
			bank.displayDetails();
		}
	
	}

}
