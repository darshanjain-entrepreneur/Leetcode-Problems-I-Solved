class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        
        
        List<Integer> ans = new ArrayList<>();
        
        ans.add(1);
        long a = 1;
        
       for(int i =1; i <= rowIndex; i++){
           
           
           a = a*((long)(rowIndex - i + 1));
           a = a/((long)(i));
         int b = (int)a;
           ans.add(b);
           
           
       }
        
        return ans;
    }
}