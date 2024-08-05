//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.findDiff(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long findDiff(long arr[], long n)
    {
        Map<Long,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i]) + 1);
           }
           else{
               map.put(arr[i],1);
           }
       }
       long max = (Collections.max(map.values()));
       long min = (Collections.min(map.values()));
       return (max-min);
    }
}