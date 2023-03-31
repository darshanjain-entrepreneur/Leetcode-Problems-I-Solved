class Solution {
    public boolean canFinish(int N, int[][] prerequisites) {
        
            
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     
     for(int i = 0; i < N; i++){
         
         adj.add(new ArrayList<Integer>());
     }
     
     int indegree[] = new int[N];
     
     for(int i = 0; i < prerequisites.length; i++){
         
         adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
         
         indegree[prerequisites[i][0]]++;
         
     }
     
     Queue<Integer> q = new LinkedList<>();
     
   for(int i = 0; i < N; i++){
       
       if(indegree[i] == 0){
           q.add(i);
           
       }
   }
     
     
     while(!q.isEmpty()){
         
         int node = q.poll();
         
         for(Integer it : adj.get(node)){
             
             indegree[it]--;
             if(indegree[it] == 0){
                 
                 q.add(it);
             }
             
             
         }
         
         
     }
     
     for(int i = 0; i < N; i++){
         
         if(indegree[i] > 0){
             return false;
         }
     }
     
     return true;
    }
    
}