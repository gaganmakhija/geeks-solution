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
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i = 0;i<N;i++){
            
            if(check(Dictionary[i] , Pattern)){
                ans.add(Dictionary[i]);
            }
        }
        Collections.sort(ans);
        if(ans.isEmpty())ans.add("-1");
        return ans;
    }
    
    boolean check(String word , String abb){
        String temp ="";
        
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) <= 90){
                temp+=""+word.charAt(i);
            }
        }
        if(temp.length() < abb.length())return false;
        int ptr = 0;
        while(ptr < Math.min(temp.length() , abb.length())){
            if(temp.charAt(ptr) != abb.charAt(ptr))return false;
            ptr++;
        }
        
        
        return true;
    }
}