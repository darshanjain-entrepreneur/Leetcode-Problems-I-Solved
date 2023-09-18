




class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> {
            
          if(a[1] != b[1]){
              
              return a[1] - b[1];
          }else{
              
              return a[0] - b[0];
          }
            
        });
        
        
        for(int i = 0; i < mat.length; i++){
            
            int count = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    break;
                }else{
                    count++;
                }
            }
            
            pq.add(new int[]{i, count});
            
        }
        
        int i = 0;
        int arr[] = new int[k];
        
        while(!pq.isEmpty() && i < k ){
            
        
         int temp = pq.poll()[0];
          arr[i] = temp;
            i++;
          
            
           
        }
        
        return arr;
        
    }
}