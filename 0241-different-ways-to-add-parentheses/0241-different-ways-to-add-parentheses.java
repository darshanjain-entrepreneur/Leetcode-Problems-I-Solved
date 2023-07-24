class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
   
        
        return recursion(expression);
        
    }
    
    public List<Integer> recursion(String s){
        
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '+' || s.charAt(i) == '-'|| s.charAt(i) == '*'){
                
                List<Integer> ans1 = recursion(s.substring(0 , i));
                List<Integer> ans2 =recursion(s.substring(i+1));
                
                for(int k = 0; k < ans1.size(); k++){
                    
                    for(int j = 0; j < ans2.size(); j++){
                        
                        if(s.charAt(i) == '+'){
                            ans.add(ans1.get(k)+ans2.get(j));
                        }else if(s.charAt(i) == '-'){
                             ans.add(ans1.get(k)-ans2.get(j));
                            
                        }else{
                            
                            ans.add(ans1.get(k)*ans2.get(j));
                        }
                        
                    }
                    
                }
                
            }
            
            
            
            
        }
        
        
        if(ans.size() == 0){
            
            ans.add(Integer.valueOf(s));
        }
        
        return ans;
        
    }
    
    
}