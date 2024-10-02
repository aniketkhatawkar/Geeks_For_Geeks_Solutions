class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int k = 1, n = arr.size();
        while(n > 1){
            arr.add(0, arr.remove(n-1));
            int toRemove = n - k < 0? 0: n - k;
            arr.remove(toRemove);
            n--;
            k++;
        }
        return arr.get(0);
    }
}