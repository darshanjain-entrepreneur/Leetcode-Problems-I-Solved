//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
      
      ArrayList<String> ans = new ArrayList<>();
      
      
      
      find(0 , 0 , m , n , ans , "");
      
      return ans;
      
      
      
    }
    
    public static  void find(int i , int j , int[][] maze , int n ,  ArrayList<String> ans , String p){
        
       if(i == n-1 && j == n-1){
           
           if(maze[i][j] == 1){
               ans.add(p);
           }
           return;
       } 
        
      if(i < 0 || j < 0 || i >= n || j >= n){
          
          return;
      }  
        
        if(maze[i][j] ==1){
            maze[i][j] = 0;
            
 find(i+1 , j , maze , n , ans , p + 'D' );
 find(i -1 , j , maze , n , ans , p + 'U');
 find(i , j +1 , maze , n , ans , p + 'R');
 find(i , j -1 , maze , n , ans , p + 'L');
            
            maze[i][j] = 1;
            
        }else{
            
            
            return;
        }
        
        
        
        
        
    }
    
    
}