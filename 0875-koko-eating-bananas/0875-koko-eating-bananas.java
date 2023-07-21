class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        
        Arrays.sort(piles);
        int ans = -1;
        
        if(h == piles.length){
            return piles[piles.length-1];
        }
        
        int start = 1;
        int end = piles[piles.length-1];
        
        
       while(start <= end){
           
           int mid = start + (end-start)/2;
           
           int k = h;
           for(int i : piles){
               
               if(i <= mid){
                   k--;
               }else{
                  int j = i/mid;
                   k = k-j;
                   j = i%mid;
                   if(j > 0){
                       k--;
                   }
               }
          
           }
           
           if(k >= 0){
               ans = mid;
               end = mid-1;
               
           }else{
               start = mid+1;
           }
           
           
       } 
        
        
      return ans;
        
    }
}