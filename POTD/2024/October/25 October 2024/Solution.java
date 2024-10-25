class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        Arrays.sort(arr);
        
        ArrayList <Integer> finalList = new ArrayList <>();
        int c=0,t=0;
        
        for(int i=0;i<arr.length;i++){
            if(i==0 || i%2==0){
                finalList.add(arr[arr.length-c-1]);
                c++;
            }
            else{
                finalList.add(arr[t]);
                t++;
            }
            
        }
        
        return finalList;
    }
}