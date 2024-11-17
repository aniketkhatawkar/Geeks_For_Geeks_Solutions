class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int slarg=-1, larg=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>larg) {
                slarg = larg;
                larg = arr[i];
            }
            else if (arr[i]<larg && arr[i]>slarg) {
                slarg = arr[i];
            }
        }
        if (larg==slarg) {
            return -1;
        }
        
        return slarg;
    }
}