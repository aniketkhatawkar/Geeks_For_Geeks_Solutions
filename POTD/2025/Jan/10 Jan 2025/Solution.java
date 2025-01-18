class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<=n-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                boolean unique=true;
                for(int p=i;p<j;p++){
                    if(arr[p]==arr[j]){
                        unique=false;
                        break;
                    }
                }
                if(unique){
                    count++;
                }
            }
            result.add(count);
        }
        
        return result;
    }
}