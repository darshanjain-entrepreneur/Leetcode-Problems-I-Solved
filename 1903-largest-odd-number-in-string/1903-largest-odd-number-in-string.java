class Solution {
    public String largestOddNumber(String num) {
        
        
        String ans = "";
        
        for(int i = 0; i < num.length(); i++){
            
            
        int a = (int)(num.charAt(i) - '0');
            
            if(a%2 != 0){
                
                ans = num.substring(0 , i+1);
            }
            
            
        }
        return ans;
    }
}