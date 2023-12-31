//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            if (!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < patt.length(); i++)
        {
            if (map.containsKey(patt.charAt(i)) && map.get(patt.charAt(i))<min)
            {
                    min = map.get(patt.charAt(i));
            }
        }
       if(min != Integer.MAX_VALUE){
            return min;
        }
        else{
            return -1;
        }
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

// } Driver Code Ends