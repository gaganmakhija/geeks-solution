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
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
         Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        list.addAll(map.values());
        Collections.sort(list);
        
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue() == list.get(list.size() - 2)) {
                return e.getKey();
            }
        }
        
        return "";
    }
}