class Solution {
    String removeDups(String str) {
        // code here
        String ans=new String();
        Set<Character> s=new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++) {
            s.add(str.charAt(i));
        }
        
        for(Character c:s)
            ans+=c;
            
        return ans;
    }
}