class Solution {
    public static int minChar(String s) {
        // Write your code here
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int[] lps = new int[concat.length()];
        int y = 0;
        for (int x = 1; x < concat.length(); x++) {
            while (y > 0 && concat.charAt(x) != concat.charAt(y)) {
                y = lps[y - 1];
            }
            if (concat.charAt(x) == concat.charAt(y)) {
                y++;
            }
            lps[x] = y;
        }
        return s.length() - lps[concat.length() - 1];
    }
}