class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]> lst = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(lst,(a,b)->Integer.compare(a[0],b[0]));
        int j=1;
        for(int i=0; i<lst.size() && j<lst.size();){
            if(i==j){
                if(i==lst.size()-1){
                    return lst;
                }
                j++;
            }
            if(lst.get(i)[1]>=lst.get(j)[0]){
                if(lst.get(i)[1]>lst.get(j)[1]){
                    lst.remove(j);
                }
                else{
                    lst.set(i,new int[]{lst.get(i)[0],lst.get(j)[1]});
                    lst.remove(j);
                }
            }
            else{
                i++;
            }
        }
        return lst;
    }
}