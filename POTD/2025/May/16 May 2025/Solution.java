class Solution {
    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        int k = arr.length;
        int[] pointers = new int[k];
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        int max = Integer.MIN_VALUE;
        int minRange = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            minHeap.offer(new Pair(arr[i][0], i));
            max = Math.max(max, arr[i][0]);
        }

        while (true) {
            Pair current = minHeap.poll();
            int min = current.val;
            int row = current.row;

            if (max - min < minRange) {
                minRange = max - min;
                result.clear();
                result.add(min);
                result.add(max);
            }

            pointers[row]++;
            if (pointers[row] == arr[row].length) {
                break;
            }

            int nextVal = arr[row][pointers[row]];
            minHeap.offer(new Pair(nextVal, row));
            max = Math.max(max, nextVal);
        }

        return result;
    }
    
    class Pair {
        int val;
        int row;

        Pair(int val, int row) {
            this.val = val;
            this.row = row;
        }
    }
}