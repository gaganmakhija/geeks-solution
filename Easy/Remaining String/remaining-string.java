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
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s,ch,count);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
        // code here
        
         HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int ct =0;
        hm.put(ch,0);
        if(count==0){
            return S;
        }
        for(int i=0;i<S.length();i++){
            char ch1 = S.charAt(i);
            if(hm.containsKey(ch1)){
                if(ct==count){
                    break;
                }
                hm.put(ch1,i);
                ct++;
            }
            
        }
        for(int i=hm.get(ch)+1;i<S.length();i++){
            char ch2 = S.charAt(i);
            sb.append(ch2);
            
        }
        if(sb.length()==0 || ct<count ){
            return "Empty string";
        }
        else{
            String ss = sb.toString();
            return ss;
        }
    }
}