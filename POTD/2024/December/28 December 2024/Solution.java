class Solution {
	public List<List<Integer>> findTriplets(int[] arr) {
	    // Your code here
	    int n = arr.length;
	    List<List<Integer>> result = new ArrayList<>();
 
	    for (int i = 0; i < n - 2; i++) {
		   for (int j = i + 1; j < n - 1; j++) {
			  for (int k = j + 1; k < n; k++) {
				 if (arr[i] + arr[j] + arr[k] == 0) {
					List<Integer> triplet = Arrays.asList(i, j, k);
					result.add(triplet);
				 }
			  }
		   }
	    }
	    return result;
	}
 }