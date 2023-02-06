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
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    
    static void reverse(int nums[] , int start , int end){
        
        while(start < end){
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            
            
        }
        
        
    }
    
    
    
    
    
    
    static List<Integer> nextPermutation(int N, int nums[]){
    List<Integer> ans = new ArrayList<>();
    
    if(N == 1){
        ans.add(nums[0]);
        return ans;
    }
    
    int k = N  - 2;
    for(int i = N-1; i > 0; i--){
        
        if(nums[i-1] >= nums[i]){
            k--;
        }else{
            break;
        }
        
    }
    
    if(k == -1){
        reverse(nums , 0 , N-1);
    }else{
        
        for(int i = N-1; i >= 0; i--){
            
            if(nums[i] > nums[k]){
              int temp = nums[i];
              nums[i] = nums[k];
              nums[k] = temp;
              break;
            }
            
        }
        
        reverse(nums , k + 1 , N -1);
        
        
        
    }
    
    
    for(int i = 0; i < N; i++){
        ans.add(nums[i]);
    }
    
    
    return ans;
    
    }
}