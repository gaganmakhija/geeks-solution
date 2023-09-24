//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        // Convert the string to a character array to get the length
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE; // Initialize ans with a large value

        while (j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            if (map.size() == set.size()) {

                while ( map.get(arr[i]) > 1) {
                    map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
                    i++;
                }
                ans = Math.min(ans, j - i + 1);
            }
            j++;
        }

        return ans;
    }
}