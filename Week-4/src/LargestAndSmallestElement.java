
public class LargestAndSmallestElement {
	
	
	public static int largestElement(Integer [] arr) {
		int maxi = 0;
		int n = arr.length;
		for (int i = 0;i<n;i++) {
			if (arr[i] > maxi){
				maxi = arr[i];
			}
		}
		return maxi;
		
	}
	
	public static int smallestElement(Integer [] arr) {
		int mini = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0;i<n;i++) {
			if (arr[i] < mini){
				mini = arr[i];
			}}
		return mini;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {9,3,1,4,6};
		System.out.println(largestElement(arr));
		System.out.println(smallestElement(arr));

		

	}

}
