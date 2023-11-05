//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        // code here
        
         String m=""+str.charAt(0);
        
        for(int i=0;i<str.length()-1;i++)
        {
         
         if(str.charAt(0)==str.charAt(i+1))
         {
             break;
         }
         
           if(str.charAt(i)>=str.charAt(i+1)) 
           {
              m=m+str.charAt(i+1);
           }
           else
           {
               break;
           }
        }
        
       StringBuilder sb = new StringBuilder();
       sb.append(m);
       
        return m+sb.reverse().toString();
    }
}
        
