class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] s = str.split("\\.");
        
        if(s.length!=4){
            return false;
        }
        else{
            for(String i:s){
                if(i.equals(""))
                    return false;
                    
                if(i.length()>1 && i.startsWith("0"))
                    return false;
                    
                if(Integer.parseInt(i)>255 || Integer.parseInt(i)<0)
                    return false;
            }
        }
        return true;
    }
}