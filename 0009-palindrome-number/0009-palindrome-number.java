class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        
        if(x == 0){
            return true;
        }
        
        StringBuilder b = new StringBuilder();
        
        while(x!= 0){
            
            int a = x%10;
            b.append(a);
            x=x/10;
            
            
        }
        
        String str1 = b.toString();
        b.reverse();
        String str2 = b.toString();
        
        if(str1.equals(str2)){
            return true;
        }
        return false;
        
    }
}