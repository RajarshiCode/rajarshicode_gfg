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
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    
    public static boolean isVowel(char ch){
        if(ch == 'a' ||
        ch == 'i' || ch == 'o' ||
        ch == 'u' || ch=='e')
            return true;
        return false;    
    }
    
    String modify (String s)
    {
        // your code here
        
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start<end){
            if(!isVowel(ch[start]))
                start++;
            else if(!isVowel(ch[end]))
                end--;
            else
                {
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                    end--;
                }
        }
        
        
        return String.valueOf(ch);
        
    }
}