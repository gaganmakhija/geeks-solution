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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isGoodorBad(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int vol = 0;
        int cons = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                vol++;
                cons = 0;
            } else if (c == '?') {
                vol++;
                cons++;
            } else {
                cons++;
                vol = 0;
            }
            if (vol == 6 || cons == 4) {
                return 0;
            }
        }
        return 1;
    }
};