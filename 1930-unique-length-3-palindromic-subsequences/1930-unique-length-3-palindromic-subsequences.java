class Solution {
    public int countPalindromicSubsequence(String s) {
        
        
        
      HashMap<Character, Integer> map1 = new HashMap<>();
        
        HashMap<Character , Integer> map2 = new HashMap<>();
        HashMap<Character , Integer> map3 = new HashMap<>();
        int arr[] = new int[26];
        
        for(int i = 0;  i< s.length(); i++){
            
            char c = s.charAt(i);
            
        if(map1.containsKey(c) == false){
            map1.put(c , i);
        }else{
            
            map2.put(c , i);
            
        }
         
            int a = (int)(c  - 'a');
            arr[a]++;
            
        }
        
        
             
        int count = 0;
        
        
        for(int i = 0; i <= 25; i++){
            
            char c = (char)(i + 'a');
            
         
            if(map1.containsKey(c) == false){
                continue;
            }
            int start = map1.get(c);
            
            if(map2.containsKey(c) == false){
                continue;
            }
          
           
            int end = map2.get(c);
            
            count = count + end-start-1;
            
         boolean brr[] = new boolean[26];
            
            for(int j = start+1;  j<= end-1; j++){
                
                char d = s.charAt(j);
                int e = (int)(d - 'a');
                
                if(brr[e] == false){
                    brr[e] = true;
                }else{
                    
                    count--;
                }
                
                
                
            }
                
            
            
        }
        
     
     
        
       
        return count;
    }
}