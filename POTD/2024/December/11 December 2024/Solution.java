class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int index = 0;
        int[] c = new int[a.length+b.length];
        
        for(int i=0;i<a.length;i++){
            c[index++] = a[i];
        }
        
        for(int i=0;i<b.length;i++){
            c[index++] = b[i];
        }
        
        Arrays.sort(c);
        int mid = a.length;
        
        for(int i=0;i<mid;i++){
            a[i] = c[i];
        }
        
        for(int i=mid;i<c.length;i++){
            b[i-mid] = c[i];
        }
    }
}