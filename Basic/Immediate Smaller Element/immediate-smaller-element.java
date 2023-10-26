//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().immediateSmaller(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
         int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            if(!s.isEmpty() && s.peek()<arr[i]){
                ans[i]=s.peek();
                s.pop();
            }else{
                ans[i]=-1;
            }
            s.push(arr[i]);
        }
         for(int i = 0; i <= n - 1; i++){
            arr[i] = ans[i];
        }
        
    
    }
}