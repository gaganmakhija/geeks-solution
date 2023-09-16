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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int c[] = new int[26];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            c[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(c[i] > 0){
                int temp = map.getOrDefault(c[i], 0);
                map.put(c[i], temp+1);
            }
        }
        
        if(map.size() == 1)return true;
        if(map.size() > 2)return false;
        
        
        int val1 = -1;
        int val2 = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == 1 && entry.getValue() == 1)return true;
            
            if(val1 == -1)val1 = entry.getKey();
            else val2 = entry.getKey();
        }
        if(Math.abs(val2 - val1) > 1)return false;
        if(val1 > val2 && map.get(val1) == 1)return true;
        if(val2 > val1 && map.get(val2) == 1)return true;
        return false;
    }
}