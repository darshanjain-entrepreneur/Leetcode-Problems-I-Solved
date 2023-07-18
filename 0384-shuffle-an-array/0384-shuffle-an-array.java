class Solution {

    ArrayList<Integer> ll = new ArrayList<>();
    int ans[];
    public Solution(int[] nums) {
        for(int i : nums){
            ll.add(i);
        }
        ans = nums;
    }
    
    public int[] reset() {
        return ans;
    }
    
    public int[] shuffle() {
        
        Collections.shuffle(ll);
        int arr[] = new int[ll.size()];
      for(int i = 0; i < ll.size(); i++){
          
        arr[i] = ll.get(i);
      }
        
     return arr;
    }
}

