import java.util.Scanner;
import java.util.ArrayList;

class InvalidInputException extends Exception{
    public InvalidInputException(String msg){
        super(msg);
    }
}



public class InputValidation {
    public static void main(String [] args){
        ArrayList <Integer> number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("enter number :");
            try{
                if (!scanner.hasNextInt()){
                    String s = scanner.next();
                    if (s.equals("exit")){
                        break;
                    }
                    else{
                        throw new InvalidInputException("enter a numeric value");
                    }
                }
                else{
                    int num = scanner.nextInt();
                    number.add(num);
    
                }
            }
            catch (InvalidInputException e){
                System.out.println(e.getMessage());
                }
            }
            System.out.println("Numbers entered: " + number);
        
            scanner.close();

        }
    }
    
