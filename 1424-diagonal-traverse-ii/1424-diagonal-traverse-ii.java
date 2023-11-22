class Solution {
    
    
    class Pair{
        
        int row;
        int col;
        int value;
        public Pair(int row , int col , int value){
            
            this.row = row;
            this.col = col;
            this.value = value;
        }
        
    }
    
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
  
        
        HashMap<Integer , ArrayList<Integer>> map1 = new HashMap<>();
        
   
        
        List<Integer> ans = new ArrayList<>();
        
        
     
      
        
        Queue<Pair> pq = new LinkedList<>();
        
        pq.add(new Pair(0 , 0 , nums.get(0).get(0)));
        map1.put(0 , new ArrayList<>());
        map1.get(0).add(0);
   
 
        
        while(!pq.isEmpty()){
            
            int rows = pq.peek().row;
            int cols = pq.peek().col;
            int  value = pq.peek().value;         
            pq.poll();
            
            ans.add(value);
            
            if(rows+1 < nums.size() && nums.get(rows+1).size() > cols && (map1.containsKey(rows+1) == false
                  ||   map1.get(rows+1).size() <= cols                                                     ) ){
                
                if(map1.containsKey(rows+1) == false){
                    map1.put(rows+1 , new ArrayList<>());
                }
                
                map1.get(rows+1).add(cols);
                
                
          
                pq.add(new Pair(rows+1 , cols , nums.get(rows+1).get(cols)));
            }
            
            if(cols + 1 < nums.get(rows).size() &&  map1.get(rows).size() <= cols+1 ){
               
             map1.get(rows).add(cols+1);
                
                pq.add(new Pair(rows , cols+1 , nums.get(rows).get(cols+1)));
                
            }
            
            
            
        }
        
        
        
int arr[] = new int[ans.size()];
        
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = ans.get(i);
        }
    
        return arr;
    }
}