class Solution {
    public int[] findArray(int[] pref) {
        
        
        int answer[] = new int[pref.length];
        
        
        for(int i = 0; i < pref.length; i++){
            
         if(i == 0){
             answer[i]  = pref[i];
         }else{
             
             answer[i] = pref[i]^pref[i-1];
         }
            
            
        }
        
        
        
        return answer;
        
        
    }
}