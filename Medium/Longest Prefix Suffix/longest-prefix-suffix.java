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
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        
          int n=s.length();
        int[] lps= new int[n];
        lps[0]=0;
        
        int i=1,prevlps=0;
        
        while(i<n) {
            
            if(s.charAt(i)==s.charAt(prevlps)) {
                prevlps++;
                lps[i]=prevlps;
                i++;
            }else {
                
                if(prevlps==0) {
                    lps[i]=0;
                    i++;
                }
                else {
                    prevlps=lps[prevlps-1];
                }
            }
        }
        
        return lps[n-1];
    }
}