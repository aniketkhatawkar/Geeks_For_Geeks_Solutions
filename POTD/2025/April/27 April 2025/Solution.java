class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here.
        int n=s1.length();
        int m=s2.length();
        if(n==0 || m==0) {
            return "0";
        }
        
        int sign1=1,sign2=1;
        if(s1.charAt(0)=='-') {
            sign1=-1;
        }
        if(s2.charAt(0)=='-') {
            sign2=-1;
        }
        
        int isNeg=sign1*sign2;
        int result[]=new int[n+m];
        int i1=0,i2=0;
        
        for(int i=n-1;i>=0;i--) {
            if(s1.charAt(i)=='-') {
                continue;
            }
            int carry=0;
            int digit1=s1.charAt(i)-'0';
            i2=0;
            
            for(int j=m-1;j>=0;j--) {
                if(s2.charAt(j)=='-') {
                    continue;
                }
                int digit2=s2.charAt(j)-'0';
                int sum=digit1*digit2+result[i1+i2]+carry;
                carry=sum/10;
                result[i1+i2]=sum%10;
                i2++;
            }
            
            if(carry>0) {
                result[i1+i2]+=carry;
            }
            i1++;
        }
        
        int i=result.length-1;
        while(i>=0 && result[i]==0) {
            i--;
        }
        
        if(i==-1) {
            return "0";
        }
        
        String s="";
        while(i>=0) {
            s+=Integer.toString(result[i--]);
        }
        
        if(isNeg==-1) {
            s="-"+s;
        }
        
        return s;
    }
}