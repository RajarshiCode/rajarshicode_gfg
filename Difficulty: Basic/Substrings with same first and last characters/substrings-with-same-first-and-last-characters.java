//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.countSubstringWithEqualEnds(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countSubstringWithEqualEnds(String s) {
        // code here
         int length = s.length();
        int count[] = new int[26];
        for(char c : s.toCharArray())
          count[c-'a']++;
           for(int i : count){
              if(i>1){
                 int temp = i*(i-1) /2;
                 length+=temp;
              }
          }
           return length;
    }
}