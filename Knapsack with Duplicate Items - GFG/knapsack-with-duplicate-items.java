//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    
    static int find(int i , int val[] , int wt[] , int W , int dp[][] , int n){
        
        if(i == 0){
           int count = 0;
           while(W - wt[0] >= 0){
               
               count = count + val[0];
               W = W - wt[0];
             
           }
           return count; 
        }
        if(dp[i][W] != -1){
            return dp[i][W];
        }
        
         int notpick = find(i -1 , val , wt , W , dp , n);
         
         int pick = -(int)1e9;
         
         
         if(wt[i] <= W){
             
             pick = val[i] + find(i , val , wt , W - wt[i] , dp , n);
         }
        
        
        return dp[i][W] =   Math.max(pick , notpick);
    }
    
    
    
    
    static int knapSack(int N, int W, int val[], int wt[])
    {

   int dp[][] = new int[N][W + 1];
   for(int rows[] : dp){
       Arrays.fill(rows , -1);
   }
   
   return find( N - 1 , val , wt , W , dp , N);


    }
}