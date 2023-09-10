//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int[] freq = new int[26];
        int start = 0, ans = -1, uniq = 0;
        
        for (int i = 0; i < s.length(); i++) {
            //STEP 1
            if (++freq[s.charAt(i) - 'a'] == 1) {
                uniq++;
            }
            
            //STEP 2
            while (uniq > k) {
                if (--freq[s.charAt(start) - 'a'] == 0) {
                    uniq--;
                }
                start++;
            }
            
            //STEP 3
            if (uniq == k) {
                ans = Math.max(ans, i - start + 1);
            }
        }
        
        return ans;
    }
}