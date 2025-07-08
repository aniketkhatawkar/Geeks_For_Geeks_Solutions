class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>(n);
        
        for(int num: arr){
            ans.add( A * (num*num) + B*num + C);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}