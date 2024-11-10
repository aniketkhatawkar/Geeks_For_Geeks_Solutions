class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        StringBuilder st=new StringBuilder();
        int carry=0;
        
        for(int i=arr.length-1;i>=0;i-=2){
            if(arr[i]+carry==0) 
                break;
                
            if(i-1>=0){
                if(arr[i]+arr[i-1]+carry>9){
                    st.append((arr[i]+arr[i-1]+carry)%10);
                     carry=1;
                }
                else {st.append(arr[i]+arr[i-1]+carry); carry=0;}
            }
            else{
                    st.append(carry+arr[i]);
                    carry=0;
            }
        }
        
        if(carry>0) 
            st.append(carry);
            
        return st.reverse().toString();
    }
}