class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] w = str.split("\\.");
        StringBuilder res = new StringBuilder();
        
        for (int i = w.length - 1; i >= 0; i--) {
            res.append(w[i]);
            if (i != 0) {
                res.append(".");
            }
        }
        
        return res.toString();
    }
}