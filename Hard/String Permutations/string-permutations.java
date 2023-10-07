//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
         ArrayList<String> res = new ArrayList<String>();
        String ans = "";
        res = perm(S, ans, res);
        Collections.sort(res);
        return res;
    }
    
    public static ArrayList<String> perm(String str, String ans, ArrayList<String> res){
         if(str.length() == 0){
            res.add(ans);
         }
         for(int i = 0; i < str.length(); i++){
             char ch = str.charAt(i);
             String newstr = str.substring(0,i) + str.substring(i+1);
             perm(newstr, ans + ch, res);
         }
         return res;
    }
	   
}
