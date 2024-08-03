//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here
        List<String> res = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        
        for(char ch : S.toCharArray())
        {
            if(Character.isAlphabetic(ch))
                s1.append(ch);
            else if(Character.isDigit(ch))
                s2.append(ch);
            else
                s3.append(ch);
        }
        
        if(s1.length() == 0)
            res.add("-1");
        else
            res.add(s1.toString());
        
        if(s2.length() == 0)
            res.add("-1");
        else
            res.add(s2.toString());
        if(s3.length() == 0)
            res.add("-1");
        else
            res.add(s3.toString());
        
        return res;
        
    }
} 
