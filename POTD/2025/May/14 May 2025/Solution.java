class Solution {
    public String countAndSay(int n) {
        // code here
        if(n == 1){
            return "1";
        }
        
        String num = countAndSay(n-1);
        
        StringBuilder str = new StringBuilder();
        
        int count = 1;
        
        for(int i=0;i<num.length();i++){
            
            if(i == num.length()-1 || num.charAt(i) != num.charAt(i+1)){
                str.append(count);
                str.append(num.charAt(i));
                count=1;
            }else{
                count++;
            }
        }
        
        return str.toString();
    }
}