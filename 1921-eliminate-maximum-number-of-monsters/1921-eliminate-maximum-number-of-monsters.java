class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = dist.length;
        int k = 1;
        
        for(int i = 0; i < n; i++){
            
            
           int a = dist[i]/speed[i];
            
            if(dist[i]%speed[i] == 0){
                
                pq.add(a);
                
            }else{
                
                pq.add(a+1);
            }
            
        }
        
        int count = 1;
        pq.poll();
        
        while(!pq.isEmpty()){
            
            
            int c = pq.poll();
            c = c - k;
            if(c <= 0){
                break;
            }else{
                count++;
            }
            
            k++;
         
            
        }
        
        return count;
        
    }
}