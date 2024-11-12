class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            if(arr[i][0]>arr[i+1][0]) {
                int temp1=arr[i][0];
                int temp2=arr[i][1];
                arr[i][0]=arr[i+1][0];
                arr[i][1]=arr[i+1][1];
                arr[i+1][0]=temp1;
                arr[i+1][1]=temp2;
            }
        }
        
        for(int i=1;i<n;i++) {
            if(arr[i][0]<arr[i-1][1]) {
                return false;
            }
        }
        
        return true;
    }
}