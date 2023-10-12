//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          
            if(str==null || str.isEmpty())
          {
              return str;
          }
          StringBuilder res=new StringBuilder();
          int count=1;
          char currCh=str.charAt(0);
          for(int i=1;i<str.length();i++)
          {
              if(str.charAt(i)==currCh)
              {
                  count++;
              }
              else
              {
                  res.append(currCh).append(count);
                  currCh=str.charAt(i);
                  count=1;
              }
          }
          res.append(currCh).append(count);
          return res.toString();
	}
	
 }