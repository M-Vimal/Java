import java.util.Scanner;

class MyArithmeticException extends Exception {
    public MyArithmeticException(String msg) {
        super(msg);
    }

}

class MyNumberFormatException extends Exception {
    public MyNumberFormatException(String msg) {
        super(msg);
    }

}

public class LaunchNestedException {

    public static double divide(double val1, double val2) throws MyArithmeticException {
        if (val2 == 0) {
            throw new MyArithmeticException("0 is not allowed");
        }
        return val1 / val2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two number for division");

        try {
            System.out.println("enter the 1st number");
            if (!scanner.hasNextDouble()) {
                throw new MyNumberFormatException("enter a numeric value");
            }
            double num1 = scanner.nextDouble();

            System.out.println("enter the 2nd number");
            if (!scanner.hasNextDouble()) {
                throw new MyNumberFormatException("enter a numeric value");
            }
            double num2 = scanner.nextDouble();
            try {
                double result = divide(num1, num2);
                System.out.println("result " + result);

            } catch (MyArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyNumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

}