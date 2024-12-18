// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int n = stalls.length;
        int min = 1;
        int max = stalls[n - 1] - stalls[0];
        
        while (min <= max) {
            int mid = (min + max) >> 1;
            
            if (canweplace(stalls, mid, k) == true) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        
        return max;
    }
    
    public static boolean canweplace(int arr[], int no, int k) {
        int cw = 1;
        int li = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[li] >= no) {
                cw++;
                li = i;
            }
            
            if (cw >= k) {
                return true;
            }
        }
        
        return false;
    }
}