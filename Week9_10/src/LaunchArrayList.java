import java.util.ArrayList;
public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		for (int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
