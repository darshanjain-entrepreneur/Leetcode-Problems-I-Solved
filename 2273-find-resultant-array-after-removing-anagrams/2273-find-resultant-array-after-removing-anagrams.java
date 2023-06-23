class Solution {
    public List<String> removeAnagrams(String[] words) {
        
         List<String> ans = new ArrayList<>();
        
        
        
        if(words.length == 1){
            
            ans.add(words[0]);
            return ans;
            
        }
        
        
        int i = 0;
        int j = 1;
        
        
        while(i < words.length && j < words.length){
            
            
            int arr[] = new int[26];
            
            for(int p = 0; p < words[i].length(); p++){
                
                int a = (int)(words[i].charAt(p) - 'a');
                
                arr[a] = arr[a] + 1;
                
                
                
            }
            
             for(int p = 0; p < words[j].length(); p++){
                
                int a = (int)(words[j].charAt(p) - 'a');
                
               arr[a] = arr[a] -1;
                
                
                
            }
            int count = 0;
            
            for(int p = 0; p <26; p++){
                
                if(arr[p] != 0){
                    
          
                  i = j;
                    j++;
                    count = 1;
                    break;
                }
                
            }
            
            
            if(count == 0){
                words[j] = "";
                j++;
                
                
            }
            
            Arrays.fill(arr , 0);
            
        }
        
        
        
        for(int p = 0; p < words.length; p++){
            
            if(words[p].equals("")){
                
                
            }else{
                ans.add(words[p]);
            }
            
        }
        
        return ans;
        
        
    }
}