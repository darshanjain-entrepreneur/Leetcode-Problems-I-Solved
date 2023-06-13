class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        String ans[] = new String[names.length];
        
        for(int i = 0; i < names.length; i++){
            
            map.put(heights[i] , i);
        }
        
        Arrays.sort(heights);
        
        
          for(int i = 0; i < names.length; i++){
            
          int index = map.get(heights[i]);
              
              ans[names.length -1 - i] = names[index];
              
              
              
          }
        
        
        
        return ans;
    }
}