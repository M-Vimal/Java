import java.util.Scanner;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String msg){
        super(msg);
    }
}

class Account{
    int balance = 10000;
    int initial_balance = balance;
    public int withdraw(int amt) throws InsufficientFundsException{
        if(amt>balance){
            throw new InsufficientFundsException("not enough balance");
        }
        balance -= amt;
        return amt;
    }

    public void rollBack(){
        System.out.println("Transaction failed! Rolling back...");
        balance = initial_balance;
    }
}

public class LaunchTransactionRollBack {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount :");
        int amount = scanner.nextInt();

        scanner.close();
        Account ac = new Account();
        try{
            int res = ac.withdraw(amount);
            System.out.println("your amt"+res);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
            ac.rollBack();
        }

    }   
}
