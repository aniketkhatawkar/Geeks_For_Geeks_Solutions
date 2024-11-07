class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        int totalSum = Arrays.stream(arr).sum();

        if (totalSum % 3 != 0) {
            return Arrays.asList(-1, -1);
        }
    
        int partSum = totalSum / 3;
        int currentSum = 0;
        int count = 0;
        List<Integer> result = new ArrayList<>();
    
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
    
            if (currentSum == partSum) {
                result.add(i);
                currentSum = 0;
                count++;
    
                if (count == 2) {
                    if (i < arr.length - 1) {
                        return result;
                    }
                    return Arrays.asList(-1, -1);
                }
            }
        }
    
        return Arrays.asList(-1, -1);
    }
}