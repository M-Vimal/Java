import java.util.Map;
import java.util.HashMap;
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> romanNumerals = new HashMap<>();

	        // Adding Roman numeral symbols and their corresponding integer values
	        romanNumerals.put("I", 1);
	        romanNumerals.put("V", 5);
	        romanNumerals.put("X", 10);
	        romanNumerals.put("L", 50);
	        romanNumerals.put("C", 100);
	        romanNumerals.put("D", 500);
	        romanNumerals.put("M", 1000);

	
	    String roman = "XIV"; 
	    // Method to convert a Roman numeral to an integer
	        int total = 0;
	        int prevValue = 0;

	        for (int i = roman.length() - 1; i >= 0; i--) {
	            String symbol = String.valueOf(roman.charAt(i));
	            int value = romanNumerals.get(symbol);

	            // If the current value is less than the previous value, subtract it
	            if (value < prevValue) {
	                total -= value;
	            } else {
	                total += value;
	            }
	            prevValue = value;
	        }

	        System.out.println("total:"+total);

	}	

}
