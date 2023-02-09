//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        
        if(A.length() != B.length()){
            return -1;
        }
        
        if(A== B){
            return -1;
        }
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < B.length(); i++){
            
            map.put(B.charAt(i) , map.getOrDefault(B.charAt(i) , 0) + 1);
        }
        
        for(int j = 0; j < A.length(); j++){
            
            if(!map.containsKey(A.charAt(j))){
                return -1;
            }else if(map.get(A.charAt(j)) == 1){
                map.remove(A.charAt(j));
            }else{
                map.put(  A.charAt(j) ,map.get(A.charAt(j)) - 1);
            }
            
        }
        
        
        
        
        int i = A.length() - 1;
        int j = B.length() - 1;
        int c = 0;
        while(i >= 0 && j>= 0){
            
            if(A.charAt(i) == B.charAt(j)){
                i--;
                j--;
            }else{
                
                i--;
                c++;
                
                
            }
            
            
            
            
            
        }
        
        return c;
        
        
    }
}