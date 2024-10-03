class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        List<Integer> res = new ArrayList<>();
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > n / 3){
                res.add(e.getKey());
            }
        }
        
        if(res.isEmpty()){
            res.add(-1);
        }
        
        return res;
    }
}