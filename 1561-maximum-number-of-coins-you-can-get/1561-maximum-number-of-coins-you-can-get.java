class Solution {
    public int maxCoins(int[] piles) {
        
        int last = 0;
        int sum = 0;
        int mid = piles.length-2;
        int end = piles.length-1;
        Arrays.sort(piles);
        
        
        while(last < mid && last < end){
            
            sum = sum + piles[mid];
            end = end-2;
            last = last+1;
            mid = mid-2;
            
            
            
            
            
            
            
        }
        
        return sum;
        
        
    }
}