class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> num2CountMap = new HashMap<>();
        for(int num : arr) {
            num2CountMap.put(num, num2CountMap.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for(int num : num2CountMap.keySet()) {
            if(num2CountMap.containsKey(num + k)) {
                result += num2CountMap.get(num) * num2CountMap.get(num + k);
            }
        }

        return result;
    }
}