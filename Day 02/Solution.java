class Solution {
    boolean kPangram(String str, int k) {
        // code here
        int [] arr = new int[26];
        int count = 0;
        int op = 0;
        
        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                arr[str.charAt(i) - 'a'] ++;
                count++;
            }
        }
        for(int i=0; i < 26; i++) {
            if(arr[i] == 0) {
                op++;
            }
        }
        return(op <= k) && (count >= 26);
    }
}