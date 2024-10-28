class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int x:arr){
            if(!ans.contains(x)) 
                ans.add(x);
        }
        return ans;
    }
}