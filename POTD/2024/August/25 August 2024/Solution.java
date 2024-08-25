class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
        long res=0;
        int[] countOfY=new int[5];
        
        for(int i=0;i<N;i++){
            if(y[i]<5){
                countOfY[y[i]]++;
            }
        }
        
        Arrays.sort(y);
        
        for(int i=0;i<M;i++){
            
            if(x[i]==0) 
             continue;
             
            if(x[i]==1){
                res+=countOfY[0];
                continue;
            } 
            
            int idx=Arrays.binarySearch(y,x[i]);
            
            if(idx<0){
                idx=-idx-1;
            }
            else{
                while(idx<N&&y[idx]==x[i]){
                    idx++;
                }
            }
            
            res+=N-idx;
            res+=countOfY[1];
            
            if(x[i]==2){
                res-=countOfY[3]+countOfY[4];
            }
            
            if(x[i]==3){
                res+=countOfY[2];
            }
        }
        
        return res;
    }
}