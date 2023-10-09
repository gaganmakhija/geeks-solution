//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        ArrayList<Character> upper=new ArrayList<Character>();
        ArrayList<Character> lower=new ArrayList<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLowerCase(c)){
                lower.add(c);
            }
            else if(Character.isUpperCase(c)){
                upper.add(c);
            }
            else{
                return "wrong input";
            }
        }
        Collections.sort(lower);
        Collections.sort(upper);
        int x=0,y=0,pos=0;
        StringBuffer s=new StringBuffer("");
        for(int i=0;i<str.length();i++){
            char d=str.charAt(i);
            if(Character.isLowerCase(d)){
                s.insert(pos,lower.get(x));
                pos++;
                x++;
            }
            else{
                s.insert(pos,upper.get(y));
                pos++;
                y++;
            }
        }
        
        return s.toString();
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends