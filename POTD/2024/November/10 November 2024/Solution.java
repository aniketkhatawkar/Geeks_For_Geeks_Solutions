class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            }
            else{
                list.add(b[j]);
                j++;
            }
        }
        if(i==n1){
            while(j<n2){
                list.add(b[j]);
                j++;
            }
        }
        else if(j==n2){
            while(i<n1){
                list.add(a[i]);
                i++;
            }
        }
        return list;
    }
}