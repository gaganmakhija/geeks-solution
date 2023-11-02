//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
         HashMap<Character, Boolean> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), true);
        }
        
        for(int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i), true);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++) {
            if(!map2.containsKey(s1.charAt(i))) {
                sb.append(s1.charAt(i));
            }
        }
        
        for(int i = 0; i < s2.length(); i++) {
            if(!map1.containsKey(s2.charAt(i))) {
                sb.append(s2.charAt(i));
            }
        } 
        
        if(sb.length() == 0) return "-1";
        return sb.toString();
    }
}
