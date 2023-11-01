class Solution {
    public String restoreString(String s, int[] ind) {
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> {
            
            return a[0] - b[0];
            
            
        });
        
        
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            
           int a = (int)(s.charAt(i) - 'a');
            pq.add(new int[]{ind[i] , a});
            
        }
        
        
        StringBuilder b = new StringBuilder();
        
        while(!pq.isEmpty()){
            
           char c = (char)('a' + pq.peek()[1]); 
            pq.poll();
           b.append(c); 
            
        }
        
        return b.toString();
        
    }
}