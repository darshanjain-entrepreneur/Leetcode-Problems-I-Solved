class Solution {
    public int[] fullBloomFlowers(int[][] f, int[] p) {
        
     
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            
            if(a[0] == b[0]){
              
                return a[2] - b[2];
                
            }else{
                return a[0] - b[0];
            }
        });
        
        
        for(int i = 0; i < p.length; i++){
            
            
            pq.add(new int[]{p[i], i , 0});
        }
      
        
       for(int i = 0; i < f.length; i++){
           
           int a = f[i][0];
           int b = f[i][1];
           pq.add(new int[]{a , i , -1});
           pq.add(new int[]{b , i , 1});
          
          
       }
        
        int counter = 0;
        int arr[] = new int[p.length];
        while(!pq.isEmpty()){
            
           
            int a = pq.peek()[0];
            int b = pq.peek()[1];
            int c = pq.peek()[2];
             pq.poll();
            
            if(c == -1){
                counter++;
            }else if(c == 0){
                arr[b] = counter;
            }else{
                counter--;
            }
            
            
            
        }
        
        
        return arr;
        
    }
}