
public class IndexOfElement {
	public static int indexOfElement(int k,Integer [] nums) {
		for (int i=0;i < nums.length;i++) {
			if (nums[i] == k) {	
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		Integer [] nums = {1,6,3,9};
		System.out.println(indexOfElement(k,nums));
		 

	}

}
