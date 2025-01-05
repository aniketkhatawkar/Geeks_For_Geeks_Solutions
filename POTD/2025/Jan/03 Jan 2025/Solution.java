class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        long count = 0;
        int xor = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            if (xor == k) {
                count++;
            }
            int target = xor ^ k;
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }
            freq.put(xor, freq.getOrDefault(xor, 0) + 1);
        }
        
        return count;
    }
}