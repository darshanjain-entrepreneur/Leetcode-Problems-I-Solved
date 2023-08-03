class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            
            return new ArrayList<String>();
        }
        
      // storing list of strings  
    List<String> PossibleOrder = new ArrayList<>();
        
        
    String characterStoring[]  = new String[10];
        
     characterStoring[2]  = "abc";
        characterStoring[3] = "def";
        characterStoring[4] = "ghi";
        characterStoring[5] = "jkl";
        characterStoring[6] = "mno";
        characterStoring[7] = "pqrs";
        characterStoring[8] = "tuv";
        characterStoring[9] = "wxyz";
        
        
        
        
        
        // function to find all strings
        findPossibleStrings(0 , digits , digits.length() , "" , characterStoring , PossibleOrder);
        
     
        return PossibleOrder;
        
        
    }
    
public void findPossibleStrings(int i , String digits , int n , String p , String[] arr, List<String> PossibleOrder){
    
    
    
    if(p.length() ==n){
        
        if(PossibleOrder.contains(p) == false){
            
            PossibleOrder.add(p);
        }
        
        return;
    }
    
    
    if(i >= n){
        return;
    }
    
    int a = (int)(digits.charAt(i) - '0');
    String b = arr[a];
    
     char c[] = b.toCharArray();
    
    for(char d : c){
        
        findPossibleStrings(i+1 , digits , n , p + d , arr , PossibleOrder);
        
        
        
    }
    
    
    
    
    
    
    
}
    
    
}