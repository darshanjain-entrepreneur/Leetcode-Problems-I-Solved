class Solution {
    public int[] topKFrequent(int[] nums, int p) {
        
        
        Arrays.sort(nums);
        
        
        
        int mat[][] = new int[nums.length][2];
        
        int prev=nums[0];
        int k = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == prev){
                
                mat[k][0] = nums[i];
                mat[k][1]++;
                
                
            }else{
                k++;
                prev = nums[i];
                mat[k][0] = nums[i];
                mat[k][1]++;
                
                
            }
            
            
            
            
        }
        
        Arrays.sort(mat , Comparator.comparingInt(x -> x[1]));
        int ans[] = new int[p];
        
        int y = 0;
        int j = mat.length-1;
        while(p > 0 && j >= 0){
            
            p--;
            ans[y] = mat[j][0];
            y++;
            j--;
            
            
            
            
        }
        
        
        return ans;
        
    }
}