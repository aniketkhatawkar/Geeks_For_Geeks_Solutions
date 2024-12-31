class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> set1 = new HashSet<>();
        
        for (int num : a) {
            set1.add(num); 
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : b) {
            if (set1.contains(num)) { 
                set2.add(num); 
            }
        }

        return new ArrayList<>(set2);
    }
}