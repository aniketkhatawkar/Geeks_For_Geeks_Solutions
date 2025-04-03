class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<String> st= new Stack<>();
        
        for(String str: arr){
            if(str.equals("+")){
                int first= Integer.parseInt(st.pop());
                int second= Integer.parseInt(st.pop());
                
                int a= second+first;
                st.push(a+"");
            }
            else if(str.equals("-")){
                int first= Integer.parseInt(st.pop());
                int second= Integer.parseInt(st.pop());
                
                int a= second-first;
                st.push(a+"");
            }
            else if(str.equals("/")){
                int first= Integer.parseInt(st.pop());
                int second= Integer.parseInt(st.pop());
                
                int a= second/first;
                st.push(a+"");
            }
            else if(str.equals("*")){
                int first= Integer.parseInt(st.pop());
                int second= Integer.parseInt(st.pop());
                
                int a= second*first;
                st.push(a+"");
            }
            else{
                st.push(str);
            }
        }
        
        return Integer.parseInt(st.peek());
    }
}