class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder b1 = new StringBuilder();
          StringBuilder b2 = new StringBuilder();
        
        
        
        for(String s : word1){
            b1.append(s);
        }
        
         for(String s : word2){
            b2.append(s);
        }
        
        String c1 = b1.toString();
          String c2 = b2.toString();
        
        if(c1.equals(c2)){
            return true;
        }
        
        return false;
    }
}