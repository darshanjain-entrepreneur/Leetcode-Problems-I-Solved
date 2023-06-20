class Solution {
    public int[] frequencySort(int[] nums) {
        
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i : nums){
            
            if(map.containsKey(i )){
                
                map.put(i ,  map.get(i)+1);
            }else{
                
                map.put(i ,1);
            }
            
            
            
            
            
            
            
        }
        
        
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            
            
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
            
            
            
            
            
        }
        
        int arr[][] = new int[nums.length][2];
        
        for(int i = 0; i  < nums.length; i++){
            
            
            arr[i][0] = nums[i];
            arr[i][1] = map.get(nums[i]);
            
            
            
        }
        
        
        Arrays.sort(arr , (x,y)-> Integer.compare(x[1] , y[1]));
        
         for(int i = 0; i  < nums.length; i++){
            
            
         nums[i] = arr[i][0];
            
            
            
        }
        
        return nums;
        
    }
}