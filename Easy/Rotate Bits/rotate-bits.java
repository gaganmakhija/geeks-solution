//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        int n = N;
        int filter = 65535;
        ArrayList<Integer> res = new ArrayList<>();
        D %= 16;
        int num1 = N>>(16-D);
        N = N<<D;
        N = N&filter;
        res.add(N|num1);
        
        
        int num2 = n>>D;
        n = n << (16-D);
        n = n&filter;
        res.add(n|num2);
        return res;
    }
}