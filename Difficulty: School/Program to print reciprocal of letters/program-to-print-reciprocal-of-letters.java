//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(char ch : S.toCharArray()){
            if(Character.isLowerCase(ch))
                sb.append((char) ('a' + ('z' - ch)));
            else if(Character.isUpperCase(ch))
                sb.append((char) ('A' + ('Z' - ch)));
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}