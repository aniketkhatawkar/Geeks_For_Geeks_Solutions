class Solution {
    static int majorityElement(int arr[]) {
        // code here
        double n = (double)arr.length/2.0;
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        
        if(arr.length == 2) 
            return -1;
            
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if((double) e.getValue()>n){
                return e.getKey();
            }
        }
        
        return -1;
    }
}