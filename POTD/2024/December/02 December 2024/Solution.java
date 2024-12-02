class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();

        int patLength = pat.length();
        int txtLength = txt.length();

        for (int i = 0; i <= txtLength - patLength; i++) {
            String subString = txt.substring(i, i + patLength);

            if (subString.equals(pat)) {
                result.add(i);
            }
        }

        return result;
    }
}