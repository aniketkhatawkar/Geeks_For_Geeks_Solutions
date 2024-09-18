class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<>();
        int n=x.length();
        int i=0;
        
        while(i<n){
            char c=x.charAt(i);
            
            if(c=='('||c=='{'||c=='[')
                st.push(c);
            else{
                if(st.isEmpty()) 
                    return false;
                char t=st.pop();
                
                if((t=='(' && c!=')')||(t=='{' && c!='}')||(t=='[' && c!=']')) 
                    return false;
            }
            i++;
        }
          
        if(!st.isEmpty()) 
            return false;
            
        return true;
    }
}