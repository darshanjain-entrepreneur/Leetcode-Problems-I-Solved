class Solution {
    public int[] sortByBits(int[] arr) {
        
        Arrays.sort(arr);
        
        int ans[][] = new int[arr.length][2];
        
        
        for(int i = 0; i < arr.length; i++ ){
            
            int a = findcountbit(arr[i]);
            
            
            ans[i][0] = a;
            ans[i][1] = arr[i];
            
            
            
            
        }
        
        
        Arrays.sort(ans , (x,y)-> Integer.compare(x[0] , y[0]));
        
        
      for(int i = 0; i < ans.length; i++){
          
          arr[i] = ans[i][1];
          
          
      }
        
        
       return arr; 
        
        
    }
    
    public int  findcountbit(int value){
        
        int count = 0;
        while(value > 0){
            
            if(value%2 == 1){
                count++;
                
            }
            value = value/2;
            
        }
        
        return count;
    }
}