//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        // code here
        int n=X.length();
        int m=Y.length();
        StringBuilder res=new StringBuilder();
        
        int p=0, q=0;
        while(p<n && X.charAt(p)=='0') p++;
        while(q<m && Y.charAt(q)=='0') q++;
        
        int i=n-1, j=m-1, carry=0;
        while(i>=p || j>=q || carry!=0)
        {
            int sum=carry;
            if(i>=p) sum+=X.charAt(i)-'0';
            if(j>=q) sum+=Y.charAt(j)-'0';
            
            res.append(sum%10);
            carry=sum/10;
            
            i--;
            j--;
        }
        
        if(res.length()==0)
        return "0";
        else
        return res.reverse().toString();
    }
}