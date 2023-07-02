class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        List<Integer> l1 = new ArrayList<>();
         List<Integer> l2 = new ArrayList<>();
        
         List<Integer> ans = new ArrayList<>();
        
        
        for(int i : nums1){
            
            l1.add(i);
        }
        
         for(int i : nums2){
            
             if(l1.contains(i) && !l2.contains(i)){
                 ans.add(i);
             }
             
            l2.add(i);
        }
        
         for(int i : nums3){
             
             if(l1.contains(i) && l2.contains(i)){
                 
                 
             }else{
                 if(l1.contains(i) && !ans.contains(i)){
                     
                     ans.add(i);
                 }else if(l2.contains(i) && !ans.contains(i)){
                     ans.add(i);
                 }
                 
                 
             }
             
             
            
        
        }
        
        
        
        
        
      return ans;  
        
    }
}