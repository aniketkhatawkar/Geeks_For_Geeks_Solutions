class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxedArr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int diffA = Math.abs(a - x);
                int diffB = Math.abs(b - x);
                if (diffA == diffB) {
                    return b - a;
                }
                return diffA - diffB;
            }
        });

        List<Integer> result = new ArrayList<>();
        for (int num : boxedArr) {
            if (num != x) {
                result.add(num);
                if (result.size() == k) break;
            }
        }

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
