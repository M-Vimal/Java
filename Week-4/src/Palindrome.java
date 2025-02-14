
public class Palindrome {
	
	public static boolean palindromeOrNot(String [] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while (i < j){
			if(!arr[i].equals(arr[j])) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr1 = {"a","a","c"}; 
		String [] arr2 = {"m","a","l","a","y","a","l","a","m"}; 

		System.out.println(palindromeOrNot(arr1));
		System.out.println(palindromeOrNot(arr2));
	}
}
