class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        
        TreeMap<Integer , Integer> map = new TreeMap<>();
        
        for(int i : arr1){
            
           if(map.containsKey(i)){
               
               map.put(i , map.get(i) +1);
           } else{
               
               
               map.put(i , 1);
           }
            
            
            
            
            
        }
        
        int p = 0;
        
        for(int i = 0; i < arr2.length; i++){
            
            if(map.containsKey(arr2[i])){
                
                int k = map.get(arr2[i]);
                while(k > 0){
                    
                    arr1[p] = arr2[i];
                    k--;
                    p++;
                }
                
                map.remove(arr2[i]);
                
            }
            
            
            
            
        }
        
        
        if(p == arr1.length){
            return arr1;
        }else{
            
            
            for(int i : map.keySet()){
                
              int k = map.get(i);
                while(k > 0){
                    
                    arr1[p] = i;
                    k--;
                    p++;
                }
                
                
            }
            
            
            
            
        }
        
        
        return arr1;
    }
}