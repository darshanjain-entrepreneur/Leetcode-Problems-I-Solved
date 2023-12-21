class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        for(int i = 0; i < points.length; i++){
            
            
            pq.add(points[i][0]);
        }
        
        int a = pq.poll();
        int diff = 0;
        
        while(!pq.isEmpty()){
            
            
            int b = pq.poll();
            
            diff = Math.max(b - a , diff);
            
            a = b;
            
            
            
        }
        return diff;
    }
}