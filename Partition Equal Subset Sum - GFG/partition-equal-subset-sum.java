//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    
    static boolean finding(int i , int n , int nums[] , int sum , int dp[][] ){
        
        if(sum == 0){
            return true;
        }
        
        if(i == n){
            return false;
        }
        
        if(dp[i][sum] != -1){
            
            if(dp[i][sum] == 0){
                return false;
            }else{
                return true;
            }
            
        }
        
        
        
        boolean nottake = finding(i + 1 , n , nums , sum , dp );
        
        boolean take = false;
        if(nums[i] <= sum){
            
            take = finding(i + 1 , n , nums , sum - nums[i] , dp);
            
        }
        
        if(take || nottake){
            
            dp[i][sum] = 1;
        }else{
            dp[i][sum] = 0;
        }
        
        return take || nottake;
        
    }
    
    
    
    
    
    
    static int equalPartition(int N, int arr[])
    {
        
     
    int sum = 0;
    
    for(int i = 0; i < N;i++){
        sum = sum + arr[i];
    }
     
     
   int  dp[][] = new int[N][(sum/2) + 1];
 
 
 for(int rows[] : dp){
     Arrays.fill(rows , -1);
 }
 
     
     
      if(sum%2 == 0){
          
          if(finding(0 , N , arr , sum/2 , dp)){
              return 1;
          }
          
          
      } 
     
       
       
       return 0;
       
       
       
       
    }
}