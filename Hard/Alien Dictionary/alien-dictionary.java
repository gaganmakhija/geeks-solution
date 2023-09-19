//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<Integer> graph[]=new ArrayList[K];
        for(int i=0;i<K;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<N-1;i++)
        {
            String s1=dict[i];
            String s2=dict[i+1];
            
            int n=Math.min(s1.length(),s2.length());
            for(int j=0;j<n;j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    graph[s1.charAt(j)-'a'].add(s2.charAt(j)-'a');
                    break;
                }
            }
        }


        // using stack and dfs for topological sorting

        Stack<Integer> stack=new Stack<>();
        boolean vis[]=new boolean[K];


        // traversing over edges of graph 


        for(int i=0;i<K;i++)
        {
            
            if(!vis[i])
            topsortutil(graph,i,vis,stack);
        }
        
        // finding answer string


        String ans="";
        while(!stack.isEmpty())
        {
            char c=(char)(stack.pop()+'a');
            ans+=c;
        }
        return ans;
    }
    
    // topological sorting


    public void topsortutil(ArrayList<Integer> graph[],int curr,boolean vis[],Stack<Integer> stack)
    {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            int next=graph[curr].get(i);
            if(!vis[next])
            {
                topsortutil(graph,next,vis,stack);
            }
        }
        stack.push(curr);
        
        
    }
}