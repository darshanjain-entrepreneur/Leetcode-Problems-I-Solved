class Solution {
    public int getWinner(int[] arr, int k) {
        
        
        
        
        if(k > arr.length+5){
            int max  =arr[0];
            for(int i = 0 ; i< arr.length; i++){
                max = Math.max(max , arr[i]);
                
            }
            
            
            
            
            return max;
            
        }
        
        
        
        
        Deque<Integer> q = new ArrayDeque<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            q.addLast(arr[i]);
        }
        
        
        HashMap<Integer , Integer> win = new HashMap<>();
        
        
        while(!q.isEmpty()){
            
            int a = q.pollFirst();
            int b = q.pollFirst();
            
            if(a > b){
                win.put(a , win.getOrDefault(a , 0)+1);
                win.put(b , 0);
                if(win.get(a) == k){
                    return a;
                }
                q.addFirst(a);
                q.addLast(b);
                
            }else{
                
                win.put(b , win.getOrDefault(b , 0)+1);
                
                win.put(a , 0);
                
                if(win.get(b) == k){
                    return b;
                }
                     q.addFirst(b);
                q.addLast(a);
            }
            
            
            
        }
        
        
        
        
        return 1;
    }
}