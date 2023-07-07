class Solution {
    public int[] sortArray(int[] nums) {
        
      TreeMap<Integer , Integer> map = new TreeMap<>();  
        int arr[] = new int[nums.length];
        
        for(int i : nums){
            
            map.put(i , map.getOrDefault(i , 0) + 1);
            
        }
       
        int k = 0;
      for(int i : map.keySet()){
          
          int ans = map.get(i);
          while(ans != 0){
              arr[k] = i;
              ans--;
              k++;
          }
          
          
      }  
        
        return arr;
    }
}