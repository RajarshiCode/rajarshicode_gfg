//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.lastIndex(s));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        char[] ch = s.toCharArray();
        int index = -1;
        for(int i = 0; i<ch.length; i++)
        {
            if(ch[i] == '1')
                index = i;
        }
        return index; 
    }    
}
