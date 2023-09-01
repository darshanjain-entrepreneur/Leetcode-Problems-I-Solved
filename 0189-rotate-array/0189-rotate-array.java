class Solution {
    public void rotate(int[] arr, int k) {
        
        int n = arr.length;
        
        k = k%n;
        
        if(n == 1){
            return;
        }
        
        if(k == 0){
            
            return;
        }
        
       
       ArrayList<Integer> ll = new ArrayList<>();
        
        int m = n - k;
        for(int i = m; i < n; i++){
            ll.add(arr[i]);
        }
        
        for(int i = 0; i < m; i++){
            
            ll.add(arr[i]);
        }
      
        
        for(int i = 0; i < n; i++){
            
            arr[i] = ll.get(i);
        }
        
    }
}