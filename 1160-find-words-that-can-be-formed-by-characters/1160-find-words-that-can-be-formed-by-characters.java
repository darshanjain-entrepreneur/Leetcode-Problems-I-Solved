class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int arr[] = new int[26];
        
        
        for(int i = 0; i < chars.length(); i++){
            
            int b = (int)(chars.charAt(i) - 'a');
            arr[b] = arr[b]+1;
            
            
        }
        
        int sum = 0;
        
        for(String s : words){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                
                char ch = s.charAt(i);
                int a = (int)(ch -'a');
                if(arr[a] == 0){
                    count =1;
                    break;
                }else{
                    
                    arr[a] = arr[a]-1;
                    
                    
                }
                
                
                
            }
            
            
            if(count == 0){
                sum = sum + s.length();
            }
            
            Arrays.fill(arr , 0);
              for(int i = 0; i < chars.length(); i++){
            
            int b = (int)(chars.charAt(i) - 'a');
            arr[b] = arr[b]+1;
            
            
        }
            
            
            
        }
        
        
        
        
        return sum;
        
        
    }
}