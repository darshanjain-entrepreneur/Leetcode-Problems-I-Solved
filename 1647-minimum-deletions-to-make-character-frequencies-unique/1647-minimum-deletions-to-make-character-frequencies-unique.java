class Solution {
    public int minDeletions(String s) {
        
        
        


 char arr[] = s.toCharArray();
        
        

 Arrays.sort(arr);
        String b = new String(arr);

      
        int freq[] = new int[26];
        
        for(int i = 0; i < b.length(); i++){
            
            int a = (int)(b.charAt(i) - 'a');
            freq[a]++;
        }
        
        
    HashMap<Integer , Integer> map = new HashMap<>();
           
   for(int i : freq){
       
       if(i > 0){
           map.put(i, map.getOrDefault(i , 0) + 1);
       }
       
       
   }
        
     
     int delete = 0;
        
      int i = 0;
        
        while(i < b.length()){
            
            char c = b.charAt(i);
            while(i < b.length() && b.charAt(i) == c){
                
                i++;
            }
            
            int a = (int)(c-'a');
            int frequency = freq[a];
           if(map.get(frequency) > 1){
               delete++;
               map.put(frequency , map.get(frequency) - 1);
               for(int j = frequency-1; j > 0; j--){
                   
                   if(!map.containsKey(j)){
                       map.put(j , 1);
                       break;
                   }else{
                       delete++;
                   }
                   
               }
            
               
               
           }
            
            
        }
        
        
        
        return delete;
    }
}