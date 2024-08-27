class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int l[] = new int[arr.length];
        int r[] = new int[arr.length];
    
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
    
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty()) {
                if (s.peek() >= arr[i]) {
                    s.pop();
                }
                if (!s.isEmpty()) {
                    if (s.peek() < arr[i]) {
                        l[i] = s.peek();
                        break;
                    }
                }
            }
            s.push(arr[i]);
        }
    
        Stack<Integer> s1 = new Stack<>();
        s1.push(arr[arr.length - 1]);
    
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!s1.isEmpty()) {
                if (s1.peek() >= arr[i]) {
                    s1.pop();
                }
                if (!s1.isEmpty()) {
                    if (s1.peek() < arr[i]) {
                        r[i] = s1.peek();
                        break;
                    }
                }
            }
            s1.push(arr[i]);
        }
    
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = Math.abs(l[i] - r[i]);
            sum = Math.max(sum, temp);
        }
    
        return sum;
    }
}