class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
ArrayList<Integer> ll = new ArrayList<>();
        ll.add(0);
          int N = (int)(1e9)  + 7;
                
        
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                
                sum = sum + nums[j];
              sum = sum%N;
                ll.add(sum);
                
            }
            
            
            
            
        }
        
        Collections.sort(ll);
        
        int sum = 0;
        for(int i = left; i <= right; i++){
            
            sum = sum+ll.get(i);
            sum = sum%N;
            
            
        }
        return sum;
        
    }
}