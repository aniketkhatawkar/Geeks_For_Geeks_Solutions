class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        int i=0;
        int j=0;
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while(j<n){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            
            if(map.size() == j-i+1){
                j++;
            }
            else{
                while(map.size() > k){
                    if(map.containsKey(arr[i])){
                        map.put(arr[i],map.getOrDefault(arr[i],0)-1);
                    }
                    
                    if(map.get(arr[i]) == 0){
                        map.remove(arr[i]);
                    }
                    
                    i++;
                }
                
                if((map.size() < j-i+1) && (j-i  <= k)){
                  
                    return true;
                }
                
                j++;
            }
            
        }
        
        return false;
    }
}