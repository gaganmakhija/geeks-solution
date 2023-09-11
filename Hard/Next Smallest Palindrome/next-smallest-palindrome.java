//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int num[] = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
          Vector<Integer> v = new Vector<>();
        if(checkNine(n, num, v)) 
            return v;
        boolean flag = false;
        int mid = 0;
        if(n % 2 != 0) {
            mid = n/2;
            int i;
            for(i = 0 ;i < mid ; i++) {
                if(num[mid-1-i] < num[mid+1+i]) {
                    flag = true;
                    break;
                }
                else if(num[mid-1-i] > num[mid+1+i])
                    break;
            }
            if(i == mid)
                flag = true;
        }
        
        else {
            mid = n/2 - 1;
            int i;
            for(i = 0 ; i <= mid ; i++) {
                if(num[mid-i] < num[mid+1+i]) {
                    flag = true;
                    break;
                }
                else if (num[mid-i] > num[mid+1+i])
                    break;
            }
            if(i == mid+1)
                flag = true;
        }
        if(flag) {
            int carry = 1;
            int x = mid;
            do {
                num[x] = (num[x] + carry)%10;
                if(num[x] != 0)
                    carry = 0;
                x--;
            }while(carry != 0);
        }
        for(int i = 0 ; i < n / 2 ; i++) 
            num[n-1-i] = num[i];
        
        for(int i = 0 ; i < n ; i++)
            v.add(num[i]);
        return v;
    }
    
    public boolean checkNine(int n, int nums[], Vector<Integer> v) {
        int i = 0;
        for( ; i < n/2 ; i++) {
            if(nums[i] != 9 || nums[n-1-i] != 9)
                return false;
        }
        
        if(nums[n/2] == 9) {
            v.add(1);
            for(i = 0 ; i < n-1 ; i++)
                v.add(0);
            v.add(1);
            return true;
        }
        return false;
    }
}