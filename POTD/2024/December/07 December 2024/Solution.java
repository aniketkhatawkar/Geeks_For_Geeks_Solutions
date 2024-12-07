class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return divide(arr , 0 , arr.length-1);
    }
    
    public static int merge( int i , int j, int mid, int arr[]){
    
        int right = mid+1;
        int left = i;
        int count = 0;
        
        List<Integer>temp = new ArrayList<>();
        
        
        while(left <= mid && right <= j){
            
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            
            else 
            {
                temp.add(arr[right]);
                count += (mid-left + 1);
                right++;
            }
        }
        
        while(left <= mid)
        temp.add(arr[left++]);
        
        while(right <= j)
        temp.add(arr[right++]);
        
        for(int k = 0;k<temp.size();k++)
        arr[i+k] = temp.get(k);
        
        return count;
    }
    
    public static int divide(int arr[] , int i , int j){
        int count = 0;
        
        if(i >= j)
        return count ;
        int mid = (i+j)/2;
        
        count += divide(arr , i , mid);
        count += divide(arr , mid+1 , j);
        count += merge(i , j , mid , arr);
        return count;
    }
}