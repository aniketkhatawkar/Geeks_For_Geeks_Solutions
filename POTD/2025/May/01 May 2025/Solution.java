class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        long value = 1;
        
        for(int i=0; i<n; i++){
            row.add((int) value);
            value = value * (n - i - 1)/(i + 1);
        }
        
        return row;
    }
}