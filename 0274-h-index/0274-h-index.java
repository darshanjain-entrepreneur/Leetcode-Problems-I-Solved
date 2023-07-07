class Solution {
    public int hIndex(int[] c) {
        
        int hindex[] = new int[c.length+1];
        
        for(int i : c){
            
            if(i >=c.length){
                i = c.length;
            }
            hindex[i] = hindex[i]+1;
        }
        
        int sum = 0;
     
        for(int i = hindex.length-1; i >=0; i--){
            System.out.println(sum);
         sum = sum + hindex[i];
            if(i <= sum){
                
                return i;
            }
            
        }
        
        
        
        return 1;
        
        
    }
}