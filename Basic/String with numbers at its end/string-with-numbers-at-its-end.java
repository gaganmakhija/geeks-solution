//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.isSame(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
         int a = 0;
        int n = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                n = n*10 + s.charAt(i)-'0';
                a++;
            }
        }
        
        if(s.length()-a==n) 
            return 1;
        else 
            return 0;
    }
}