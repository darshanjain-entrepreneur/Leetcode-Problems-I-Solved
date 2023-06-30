class Solution {
    public String convert(String s, int numRows) {
        
        if(s.length() == 1 || s.length() == 2){
            return s;
        }
        if(numRows == 1){
            return s;
        }
        
        List<List<Character>> ans = new ArrayList<>();
        
        int k = numRows;
        
        while(k != 0){
            
            ans.add(new ArrayList<>());
            k--;
        }
        System.out.println(ans.size());
        int count = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
          
           
             if(count == 0){
                ans.get(j).add(s.charAt(i));
                 if(j == ans.size() -1){
                     count = 1;
                     j--;
                 }else{
                     j++;
                 }
                 
              
            }else if(count == 1){
                ans.get(j).add(s.charAt(i));
                 if(j == 0){
                     count = 0;
                     j++;
                 }else{
                     j--;
                 }
                
            }
            
        }
        StringBuilder b= new StringBuilder();
        
      for(int i = 0; i < ans.size(); i++){
          
          
          for(int y = 0; y < ans.get(i).size(); y++){
              
              b.append(ans.get(i).get(y));
          }
      }  
        
      return b.toString();  
        
    }
}