class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>(minHeap);
        result.sort(Collections.reverseOrder());
        
        return result;
    }
}