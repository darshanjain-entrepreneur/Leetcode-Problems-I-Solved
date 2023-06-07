class Solution {
    public List<String> letterCombinations(String digits) {
        
        
        String digitarray[] = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        
        List<String> ans = new ArrayList<>();
        
        find(0 , digits , ans , digitarray , "");
        
        return ans;
        
    }
    
    public void find(int index , String digits , List<String> ans ,  String digitarray[] , String p ){
        
        if(index >= digits.length()){
            
            if(p == ""){
                
            }else{
                 ans.add(p);
            }
           
            return;
        }
        
        
    String word = digitarray[digits.charAt(index) - '0'];
        
        for(int i = 0; i< word.length(); i++){
            
            find(index +1 , digits , ans , digitarray , p + word.charAt(i));
            
            
            
        }
    
        
        
        
        
        
        
    }
}