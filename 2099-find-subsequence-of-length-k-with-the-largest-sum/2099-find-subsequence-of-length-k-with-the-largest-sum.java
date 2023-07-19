
class Pair{
    
    int value;
    int index;
    public Pair(int value , int index){
        this.value = value;
        this.index = index;
    }
}




class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            return a.value-b.value;
        });
        
     
        for(int i =nums.length-1;i>=0; i--){
            
            
            pq.add(new Pair(nums[i] , i));
            if(pq.size() > k){
                pq.poll();
            }
            
            
            
        }
        
       PriorityQueue<Pair> pp = new PriorityQueue<>((a,b)->{
           return a.index-b.index;
       });
        
      
        while(!pq.isEmpty()){
            
           pp.add(pq.poll());
        }
        
        int arr[] = new int[k];
        int i = 0;
        while(!pp.isEmpty()){
            
          arr[i] = pp.poll().value;
            i++;
        }
        
     return arr;
    }
}