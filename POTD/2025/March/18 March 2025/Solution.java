class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum=0;
        
        for(int i:arr){
            sum+=i;
        }
        
        if(sum%2!=0){
            return false;
        }
        else{
            return isSubsetSum(arr,sum/2);
        }
    }
    
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean[][] mat=new boolean[arr.length][sum+1];
        for(int i=0;i<mat.length;i++){ 
            mat[i][0]=true;
        }
        
        for(int i=0;i<mat[0].length;i++){
            if(i==arr[0]){
                mat[0][i]=true;
            }
           
        }
        
        for(int i=1;i<mat.length;i++){
            for(int j=0;j<sum+1;j++){
                if(mat[i-1][j]){
                    mat[i][j]=true;
                }else{
                    if(j>=arr[i]){
                        mat[i][j]=mat[i-1][j-arr[i]];
                    }
                }
            }
        }
        
        return mat[arr.length-1][sum];
    }
}