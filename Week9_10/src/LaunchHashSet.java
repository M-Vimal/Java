
import java.util.HashSet;

public class LaunchHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(4);
		hs.add(3);
		hs.add(5);
		hs.add(6);
		System.out.println(hs);
		
		for (Integer num:hs) {
			System.out.println(num);
		}

	}

}
