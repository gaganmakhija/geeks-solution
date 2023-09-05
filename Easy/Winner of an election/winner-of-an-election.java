//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String ans[]=new String [2];
        HashMap<String,Integer> m = new HashMap<>();
        ArrayList<String> s = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        int c=-1;
        for( String str : m.keySet()){
            s.add(str);
            if(m.get(str) > c){
                c=m.get(str);
            }
        }
        Collections.sort(s);
        for(int i=0;i<s.size();i++){
            if(m.get(s.get(i))==c){
                ans[0]=s.get(i);
                ans[1]=String.valueOf(c);
                break;
            }
        }
        return ans;
        
    }
}

