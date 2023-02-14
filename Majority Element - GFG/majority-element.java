//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
       HashMap<Integer , Integer> ans = new HashMap<>();
       
       if(size == 1){
           return nums[0];
       }
       
       
       
       for(int i = 0; i < size; i++){
           
           if(ans.containsKey(nums[i])){
               
               ans.put(nums[i] , ans.get(nums[i]) + 1);
              if(ans.get(nums[i]) > size/2){
                  return nums[i];
              }
               
           }else{
               ans.put(nums[i] , 1);
           }
           
           
           
           
       }
       return -1;
       
    }
}