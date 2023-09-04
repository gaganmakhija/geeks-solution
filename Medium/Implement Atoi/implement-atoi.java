//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	
	   int sign=1,start=0,ans=0;
        
        if(str.charAt(0)=='-'){
            sign= -1;
            start=1;
        } 
        for(int i= start;i<str.length();i++){
            
            char c= str.charAt(i);
            
            if(c-'0' >9 || c-'0' <0) return -1;
            
            ans = ans*10 +(c-'0');
        }
        
        return ans*sign;
    }
}
