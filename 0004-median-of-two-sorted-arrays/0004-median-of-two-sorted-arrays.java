class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if(n1  > n2){
            return  findMedianSortedArrays(nums2 , nums1);
            
        }
        
        
        int low= 0;
        int high = n1;
        
        while(low <= high){
            
            int mid1 = (low+high)/2;
            
            int mid2 = (n1+n2+1)/2 - mid1;
            int l1 = (int)-1e9;
            int l2 = (int)-1e9;
            int r1 = (int)(1e9);
            int r2 = (int)(1e9);
            
            
            if(mid1 < n1) r1 = nums1[mid1];
            if(mid2 < n2) r2 = nums2[mid2];
            
            if(mid1-1 >= 0) l1 = nums1[mid1-1];
            if(mid2 -1 >= 0)l2 = nums2[mid2-1];
            if(l1 <= r2 && l2 <= r1){
                
                if((n1+n2)%2 == 1){
                    return (double)(Math.max(l1 , l2));
                }else{
                    
                    return ((double)(Math.max(l1 , l2))  + (double)(Math.min(r1 , r2)))/2.0;
                }
                
            }else if(l1 > r2){
                high = mid1-1;
            }else{
                
                low = mid1+1;
            }
            
        }
        
        
        return 0;
        
    }
}