//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isLowerCase(ch))
                sb.append((char)('a' +('z' - ch)));
            else if(Character.isUpperCase(ch))
                sb.append((char)('A' +('Z' - ch)));
        }
        return sb.toString();
    }
} 