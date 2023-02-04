class Solution {
    public String largestNumber(int[] nums) {
        
        int n = nums.length;
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            
            arr[i] = String.valueOf(nums[i]);
        }
        
        
        
          Arrays.sort(arr ,(a , b) -> (b + a).compareTo(a + b) );
      
      StringBuilder s = new StringBuilder();
      
      for(int i = 0 ; i < arr.length; i++){
          s.append(arr[i]);
      }
      
      
      String result = s.toString();
      return result.startsWith("0") ? "0" : result;
    }
}