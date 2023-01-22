class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        
        int n  = letters.length;
        if((letters[n - 1] - 'a') <= (target - 'a')){
            return letters[0];
        }
        
        
        int start = 0;
        int end = letters.length - 1;
        
        while(start <= end){
            
            int mid = (end - start)/2 + start;
            
           if(letters[mid] - 'a' > target - 'a'){
               end = mid - 1;
           }else{
               start = mid + 1;
           }
            
            
            
            
        }
        
        return letters[start%n];
        
        
    }
}