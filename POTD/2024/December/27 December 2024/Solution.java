class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr) {
            int complement = target - num;
            count += map.getOrDefault(complement, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}