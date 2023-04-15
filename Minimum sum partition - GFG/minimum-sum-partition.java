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
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
          
         int target = 0;
         for(int i = 0; i < arr.length; i++){
             target = target + arr[i];
         }
          
          boolean dp[][] = new boolean[n][target + 1];
          
       
          
          for(int i = 0; i < n; i++){
              
              dp[i][0] = true;
          }
          
          if(arr[0] <= target){
                 dp[0][arr[0]] = true;
          }
          
          
          
          for(int i = 1; i <n; i++){
              
              for(int j = 1; j < target + 1; j++){
                  
                  boolean notpick = dp[i - 1][j];
                  
                  boolean pick = false;
                  
                  if(arr[i] <= j){
                      pick = dp[i - 1][j - arr[i]];
                  }
                  
                  dp[i][j] = notpick || pick;
              }
            
          }
          
          
          int mini = (int)1e9;
          
         for(int i = 0; i <=target/2; i++){
             
           if(dp[n-1][i] == true){
               
               mini = Math.min(mini , Math.abs(target - i - i));
           }
             
         } 
          
          
          
          
          return mini;
	} 
}
