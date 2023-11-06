//{ Driver Code Starts
// initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
        }
    }
}
// } Driver Code Ends


//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
           int countR = 0, countG = 0;
        for (char c:S.toCharArray()) {
            if (c == 'R') countR++; else countG++;
        }
        return Math.min(countR, countG);
        
    }
}