import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static int getKthLargest(ArrayList<Integer> arr, int k) {

		// Write your code here
		int n= arr.size();
		ArrayList<Integer> sum = new ArrayList<>();

		for(int i=0; i<n; i++){
			int count=0;
			for(int j=i; j<n; j++){
				count+=arr.get(j);
				sum.add(count);
			}
		}

		Collections.sort(sum, Collections.reverseOrder());
		
		return sum.get(k-1);
	}
}