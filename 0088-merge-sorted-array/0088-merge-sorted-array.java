class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if( n== 0){
            return;
        }
       if(m == 0){
           
           for(int i = 0; i < n; i++){
               
               nums1[i] = nums2[i];
               
               
               
           }
           
           
           return;
       }
        
        int i = 0;
        
        
        
    while(i < m){
        
        
        if(nums1[i] > nums2[0] ){
            
            int temp = nums1[i];
            nums1[i] = nums2[0];
            nums2[0] = temp;
            
            int k = 0;
            while(k + 1 < n){
                
                if(nums2[k] > nums2[k + 1]){
                    int tempss = nums2[k];
                    nums2[k] = nums2[k + 1];
                    nums2[k + 1] = tempss;
                    k++;
                    
                }else{
                    break;
                }
                
                
            }
            
            
        }
        
        i++;
        
    }
        
        for(int k = m; k < m + n; k++){
            
            nums1[k] = nums2[k - m];
            
            
        }
        
    }
}