class Solution {
    public boolean makeEqual(String[] words) {
             int arr[] = new int[26];
        boolean check = true;
        for(int i = 0; i < words.length; i++){
          
            String a = words[i];
       
            
            for(int k = 0; k < a.length(); k++){
                
                arr[(int)(a.charAt(k) - 'a')]++;
            }
            
            
         
            
        }
        
System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 26; i++){
            
            if(arr[i]%words.length != 0){
                
                check = false;
            }
            
        }
        return check;
    }
}