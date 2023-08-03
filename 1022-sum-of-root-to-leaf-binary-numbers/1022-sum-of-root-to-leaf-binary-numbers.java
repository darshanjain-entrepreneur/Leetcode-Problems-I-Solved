
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        
        
        return find(root , "");
        
        
        
    }
    
    
   public int find(TreeNode root , String p){
       
       if(root == null){
           return 0;
       }
       
       if(root.left == null && root.right == null){
           
          int value = 0;
         int cc = root.val;
           if(cc == 0){
                  p = p + '0'; 
           }else{
               
               p = p + '1';
           }
           
           
       
         
           int k = 0;
           for(int i = p.length()-1; i >= 0; i--){
               
               int b = (int)(p.charAt(i) - '0');
               
               int a = (int)(Math.pow(2 , k));
             
               a = a*b;
               k++;
               
               value = value + a;
               
               
           }
      
          return value; 
           
       }
       
       
       
       char chh = '1';
        if(root.val == 0){
            
            chh = '0';
            
        }
   
   
      
       int left = find(root.left , p + chh);
       int right = find(root.right , p + chh);
       
       
       return left + right;
       
       
       
       
       
   } 
    
}