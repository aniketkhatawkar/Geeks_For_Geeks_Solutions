class Solution {
    public int findSubString(String str) {
        // code here
        Map<Character,Integer> hm=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        int i=0,j=0;
        
        for(char ch:str.toCharArray()){
            hm.put(ch,0);
        }
        
        int dist=hm.size();
        hm.clear();
        
        while(j<str.length()){
            hm.put(str.charAt(j),hm.getOrDefault(str.charAt(j),0)+1);
            
            while(i<=j&&hm.size()==dist){
                ans=Math.min(j-i+1,ans);
                hm.put(str.charAt(i),hm.get(str.charAt(i))-1);
                
                if(hm.get(str.charAt(i))==0){
                    hm.remove(str.charAt(i));
            }
                i++;
            }
            j++;
        }
        return ans;
    }
}