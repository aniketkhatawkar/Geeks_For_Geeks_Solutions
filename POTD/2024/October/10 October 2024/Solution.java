class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int mul=0,k=0;
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                mul=i-map.get(arr[i]);
                if(k < mul){
                    k=mul;
                }
                mul=0;
            }else{
                map.put(arr[i],i);
            }
        }
       return k; 
    }
}