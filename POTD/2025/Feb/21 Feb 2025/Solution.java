class Solution {
    static boolean isBalanced(String s) {
        // code here
        ArrayList<Character> stack = new ArrayList<>();
        HashMap<Character,Character> hashmap = new HashMap<>();
        int len = s.length();
        int pointer = 0;
        hashmap.put('(',')');
        hashmap.put('{','}');
        hashmap.put('[',']');
        
        for(int i=0; i<len; i++){
            char currChar = s.charAt(i);
            if(currChar == '('|| currChar == '{' || currChar == '['){
                stack.add(currChar);
                pointer++;
            } else {
                if(pointer < 1){
                    return false;
                }
                if(currChar != hashmap.get(stack.get(pointer-1))){
                    return false;
                }
                stack.remove(pointer-1);
                pointer--;
            }
        }
        if(pointer>0) return false;
        return true;
    }
}