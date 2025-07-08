class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length ; 
        boolean [] visted = new boolean[n] ;
        
        int result = 0 ; 
        for(int i = 0 ; i < n  ; i++){
            
            if(visted[i]){
                continue ; 
            }
            int j = i ; 
            while(j < n && j <= i+k ){
                if(arr[i] != arr[j] && visted[j] == false ){
                    result++ ; 
                    visted[i] = true ; 
                    visted[j] = true ;
                    break ; 
                }
                j++ ; 
            }
            
        }
        
        return result ; 
    }
}