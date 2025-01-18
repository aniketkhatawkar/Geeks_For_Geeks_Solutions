class Solution {
	public int longestUniqueSubstr(String s) {
	    // code here
	    HashSet<Character> set = new HashSet<>();
	    int ans = 1,i = 0;
	    
	    for(int j = 0;j < s.length();j++){
		   char c = s.charAt(j);
		   
		   while(set.contains(c)){
				 set.remove(s.charAt(i));
				 i++;
		   }
		   
		   set.add(s.charAt(j));
		   ans = Math.max(ans,j-i+1);
	    }  
	    
	    return ans;
	}
 }