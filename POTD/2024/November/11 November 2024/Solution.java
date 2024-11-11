class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int N=arr.length;

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        int max = 0;

        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            if(set.contains(arr[i])){
                sum+=max+1-arr[i];
                max++;
                set.add(max);
            }
            else{
                set.add(arr[i]);
            }
        }
        return sum;
    }
}