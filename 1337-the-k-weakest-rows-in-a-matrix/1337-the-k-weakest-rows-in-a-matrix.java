




class Solution {
    
    public int binary(int[][] mat , int i){
        
        int start = 0;
        int end = mat[i].length-1;
        
        while(start <= end){
            
            int mid = (end-start)/2 + start;
            
            if(mat[i][mid] == 1){
                start = mid+1;
                
            }else{
                
                end = mid-1;
            }
            
            
            
        }
        
        
        return end+1;
        
        
    }
    
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> {
            return a[0]!=b[0] ? b[0] - a[0] : b[1] - a[1];
        });
        
        
     for(int i = 0; i < mat.length; i++){
         
        int numones = binary(mat , i);
         
         pq.offer(new int[]{numones , i});
         
         if(pq.size() > k){
             pq.poll();
         }
         
         
         
     }
        
        int ans[] = new int[k];
        while(k > 0){
            
            ans[--k] = pq.poll()[1];
        }
        return ans;
    }
}