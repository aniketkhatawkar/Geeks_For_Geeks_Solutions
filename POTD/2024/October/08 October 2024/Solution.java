class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                secondMax=Math.max(secondMax,arr[i]);
            }
        }
        return max+secondMax;
    }
}