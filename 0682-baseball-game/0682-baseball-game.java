class Solution {
    public int calPoints(String[] operations) {
        
        List<Integer> ans = new ArrayList<>();
        
        
        for(String s : operations){
            
            if(s.equals("+")){
               
                int c = ans.get(ans.size()-1);
                int d = ans.get(ans.size()-2);
                int e = c+d;
                ans.add(e);
                
                
            }else if(s.equals("D")){
                
                int c = ans.get(ans.size()-1)*2;
                ans.add(c);
                
            }else if(s.equals("C")){
                ans.remove(ans.size()-1);
                
            }else{
                
                int a = Integer.valueOf(s);
                ans.add(a);
                
                
                
            }
            
            
            
            
            
        }
        
        
        int sum = 0;
        for(int i = 0; i < ans.size(); i++){
            sum = sum + ans.get(i);
        }
        
        
       return sum; 
        
    }
}