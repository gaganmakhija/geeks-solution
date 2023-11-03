//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        String s="";
        for(int i=0;i<A.length();i++)
        {
            if(!B.contains(String.valueOf(A.charAt(i))) && !s.contains(String.valueOf(A.charAt(i))))
            s+=A.charAt(i);
        }
        for(int i=0;i<B.length();i++)
        {
            if(!A.contains(String.valueOf(B.charAt(i))) && !s.contains(String.valueOf(B.charAt(i))))
            s+=B.charAt(i);
        }
        char res[]=s.toCharArray();
        Arrays.sort(res);
        if(res.length==0)
        return "-1";
        return String.valueOf(res);
    }
}