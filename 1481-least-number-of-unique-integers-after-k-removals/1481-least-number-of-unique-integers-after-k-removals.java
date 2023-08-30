class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        
        int count = 0;
        TreeMap<Integer , Integer> map = new TreeMap<>();
      
        
        for(int i = 0; i < arr.length; i++){
            
           if(map.containsKey(arr[i])){
               
            
               map.put(arr[i] , map.get(arr[i]) + 1);
               
           }else{
               
               map.put(arr[i] , 1);
             
               count++;
           }
            
            
            
            
        }
        
        ArrayList<Integer> ll = new ArrayList<>();
        
        for(int i : map.values()){
            
            ll.add(i);
            
        }
        
        Collections.sort(ll);
        
        for(int i : ll){
            
            if(k >= i){
                count--;
                k = k -i;
            }
        }
        return count;
     
    }
}