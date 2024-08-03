//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    String s = br.readLine().trim();
		  
		    Complete obj = new Complete();
		    
		    System.out.println(obj.Sandwiched_Vowel(s));
		        
		}
		
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    public static String Sandwiched_Vowel(String str) 
    { 
        // Complete function
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        char[] ch = str.toCharArray();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        
        for(int i = 0; i<ch.length-2;i++)
        {
            if(!list.contains(ch[i]) &&
            list.contains(ch[i + 1]) &&
            !list.contains(ch[i + 2]))
                  ch[i+1] = ' '; 
        }
        for(int i = 0; i<ch.length;i++)
        {
             if(ch[i]!=' ')
                sb.append(ch[i]);
        }
        return sb.toString();
        
    } 
}
