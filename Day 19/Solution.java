class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int l=arr1.length, low=0, high=l;
        
    	for(; low<=high;) {
    		int mid1=low+(high-low)/2, mid2=l-mid1;
    		
    		if(arr1[mid1-1]<=arr2[mid2] && arr2[mid2-1]<=arr1[mid1])
    			return Math.max(arr1[mid1-1], arr2[mid2-1])+Math.min(arr1[mid1], arr2[mid2]);
    		else if(arr1[mid1-1]>arr2[mid2])
    			high=mid1-1;
    		else
    			low=mid1+1;
    	}
    	return 0;
    }
}