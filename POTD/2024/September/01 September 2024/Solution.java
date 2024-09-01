class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int s1=0,s2=0,s=0,i=0,j=0,n=arr1.size(),m=arr2.size();
        while(i<n && j<m){
            if(arr1.get(i)>arr2.get(j)){
                s2+=arr2.get(j++);
            }else if(arr2.get(j)>arr1.get(i)){
                s1+=arr1.get(i++);
            }else{
                s+=Math.max(s1,s2);
                s+=arr1.get(i);
                i++;
                j++;
                s1=0;
                s2=0;
                
            }
        }
        while(i<n){
            s1+=arr1.get(i++);
            
        }
        while(j<m){
            s2+=arr2.get(j++);
            
        }
        s+=Math.max(s1,s2);
        return s;
    }
}