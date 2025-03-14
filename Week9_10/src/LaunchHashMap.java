import java.util.HashMap;
public class LaunchHashMap {
	public static void main(String[] args) {
		HashMap<String , Integer> student_details = new  HashMap<>();
		student_details.put("sanji", 78);
		student_details.put("zoro", 90);
		student_details.put("luffy", 80);
		System.out.println(student_details);
	}
}
