class Solution {
    
    int min = (int)1e9;
    
    
    
    public int distributeCookies(int[] cookies, int k) {
 
        int arr[] = new int[k];
            findmax(0 , k , cookies , arr);
        
        return min;
        
        
        
        
    }
    
    public void findmax(int i , int k , int[] cookies , int[] arr){
        
       
        if(i >= cookies.length){
            int max = -1;
           for(int j = 0; j < arr.length; j++){
               
            max =    Math.max(max , arr[j]);
               
           }
            
            min = Math.min(max , min);
            return;
        }
        
        
        for(int j = 0; j < k; j++){
            
           arr[j] = arr[j] + cookies[i];
            
            
             
              findmax(i+1 , k , cookies , arr);
            
            arr[j] = arr[j] - cookies[i];
            if(arr[j] == 0){
                break;
            }
            
        }
        
        
        
        
    }
}