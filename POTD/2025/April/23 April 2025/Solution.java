class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int[] a=new int[2];
        int n=0;
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        
        for(Map.Entry<Integer,Integer> h:map.entrySet()){
            if(h.getValue()==1){
               a[n++]=h.getKey();
            }
        }
        return a; 
    }
}