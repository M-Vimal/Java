
public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		
		
		//comparing reference
		System.out.println("str1==str2 :"+ (str1 == str2));
		System.out.println("str1==str3 :"+(str1 == str3));
		System.out.println("str3==str4 :"+(str3 == str4));
		
		
		//comparing values
		System.out.println("str1 equalsto str2 :"+str1.equals(str2));
		System.out.println("str1 equalsto str3 :"+str1.equals(str3));
		System.out.println("str3 equalsto str4 :"+str3.equals(str4));
		
		
		
		//comparing hashcode
		System.out.println("str1 :"+System.identityHashCode(str1));
		System.out.println("str2 :"+System.identityHashCode(str2));
		System.out.println("str3 :"+System.identityHashCode(str3));
		System.out.println("str4 :"+System.identityHashCode(str4));	
		
	}

}
