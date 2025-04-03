class Solution {
    private int countPaths(Node root, int currentSum, int k, HashMap<Integer, Integer> prefixSumMap) {
        if (root == null) 
            return 0;

        currentSum += root.data;
        int count = prefixSumMap.getOrDefault(currentSum - k, 0);
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        count += countPaths(root.left, currentSum, k, prefixSumMap);
        count += countPaths(root.right, currentSum, k, prefixSumMap);

        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

        return count;
    }

    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);

        return countPaths(root, 0, k, prefixSumMap);
    }
}