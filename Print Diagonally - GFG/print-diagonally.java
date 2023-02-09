//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        
    ArrayList<Integer> ans = new ArrayList<>();
    
    
    for(int k = 0; k < N; k++){
        
        int row = 0; 
        int col = k;
        while(col >= 0){
            
            ans.add(A[row][col]);
            col--;
            row++;
            
            
        }
        
        
        
    }
        
        
        for(int j = 1; j< N; j++){
            
            int row = j;
            int col = N -1;
            while(row < N){
                
                ans.add(A[row][col]);
                row++;
                col--;
            }
            
        }
        return ans;
    }
}
