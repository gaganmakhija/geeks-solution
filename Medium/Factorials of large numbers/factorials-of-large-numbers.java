//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        
          ArrayList<Integer> ans=new ArrayList<>();
    java.math.BigInteger factorial = java.math.BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(java.math.BigInteger.valueOf(i));
        }
        
        while (!factorial.equals(java.math.BigInteger.ZERO)) {
            int rem = factorial.mod(java.math.BigInteger.TEN).intValue();
            ans.add(rem);
            factorial = factorial.divide(java.math.BigInteger.TEN);
        }
        Collections.reverse(ans);
        return ans;
    }
}