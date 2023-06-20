class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();
        
        
        
        
        for(int row[] : items1){
            
          map1.put(row[0] , row[1]);  
            
            
        }
        
        
        
         for(int row[] : items2){
            
          map2.put(row[0] , row[1]);  
            
            
        }
        
        
           for(int row[] : items1){
            
             ans.add(new ArrayList<>());
               
             if(map2.containsKey(row[0])){
                 
                 ans.get(ans.size()-1).add(row[0]);
                 ans.get(ans.size()-1).add(row[1] + map2.get(row[0]));
             }else{
                 
                   ans.get(ans.size()-1).add(row[0]);
                 ans.get(ans.size()-1).add(row[1]);
                 
             }  
            
            
        }
        
        
        
           for(int row[] : items2){
            
           
               if(map1.containsKey(row[0])){
                   
                   
                   
               }else{
                   
                   ans.add(new ArrayList<>());
                   ans.get(ans.size()-1).add(row[0]);
                   
                   ans.get(ans.size()-1).add(row[1]);
                   
                   
                   
               }
          
               
            
            
        }
        
        
        Collections.sort(ans , (x , y) -> Integer.compare(x.get(0) , y.get(0)));
        
        return ans;
        
        
        
        
        
    }
}