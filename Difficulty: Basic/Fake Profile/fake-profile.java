//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String a = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.solve(a));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String solve(String a)
    {
        //code here
         String vowels = "aeiou";
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<a.length(); i++){
            set.add(a.charAt(i));
        }
        
        int count =0;
        
        for(char c: set){
            if(!vowels.contains(String.valueOf(c))){
                count++;
            }
        }
        if(count%2 ==0){
            return "SHE!";
        }
        return "HE!";
    }
}