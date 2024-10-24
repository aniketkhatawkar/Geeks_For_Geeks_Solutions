class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int counter = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]>0){
                arr[i] = 2*arr[i];
                arr[i+1]=0;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                list.add(arr[j]);
            }
            else{
                counter++;
            }
        }
        while(counter>0){
            list.add(0);
            counter--;
        }
        return list;
    }
}