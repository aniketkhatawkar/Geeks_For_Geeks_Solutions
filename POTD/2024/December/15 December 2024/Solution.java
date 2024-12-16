class Solution {

    public int peakElement(int[] arr) {
        // code here
        if(arr.length==1){
            return 0;
        }
        if(arr.length==2 && arr[0]<arr[1] ){
            return 1;
        }
        
        if(arr.length==2 && arr[0]>arr[1]){
            return 0;
        }
        
        for(int i = 2;i<arr.length;i++){
            if(i<=arr.length-1 && arr[i-2]<arr[i-1]&&arr[i-1]>arr[i]){
                return i-1;
            }
            if(arr[i]>arr[i-1] && i == arr.length-1){
                return i;
            }
            
        }
        
        return -1;
    }
}