class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int total = carry;
            if (i >= 0) total += s1.charAt(i--) - '0';
            if (j >= 0) total += s2.charAt(j--) - '0';
            result.append(total % 2);
            carry = total / 2;
        }
        
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }
        
        return result.reverse().toString();
    }
}