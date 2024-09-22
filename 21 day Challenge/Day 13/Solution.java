class Solution {
    int lps(String str) {
        // code here
        int n=str.length();
        int arr[]=new int[n];
        int i=1,j=0;
        
        while(i<n){
            if(str.charAt(i)==str.charAt(j)){
                arr[i++]=++j;
            }
            else{
                if(j>0){
                    j=arr[j-1];
                }
                else {
                    i++;
                }
            }
        }
        
        return arr[n-1];
    }
}