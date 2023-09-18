
class Pair{
    
    int index;
    int count;
    public Pair(int index , int count){
        this.index = index;
        this.count = count;
    }
    
    
}



class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a , b) -> {
            
            if(a.count != b.count){
                return a.count - b.count;
            }else{
                
                return a.index - b.index;
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
            
            pq.add(new Pair(i , count));
            
        }
        
        int i = 0;
        int arr[] = new int[k];
        
        while(!pq.isEmpty() && i < k ){
            
            Pair pp = pq.poll();
            arr[i] = pp.index;
            
            i++;
        }
        
        return arr;
        
    }
}