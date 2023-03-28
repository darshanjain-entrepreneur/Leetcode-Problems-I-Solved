
public class Bstiterator{
    
    Stack<TreeNode> st =new Stack<>();
    boolean reverse = true;
    
    public Bstiterator(TreeNode root , boolean reverse){
        
        this.reverse = reverse;
        pushall(root);
    }
    
    public boolean hasnext(){
        return !st.isEmpty();
    }
    
    public int next(){
        
        TreeNode temp = st.pop();
        if(reverse == false){
            
            pushall(temp.right);
        }else{
            pushall(temp.left);
        }
        
        return temp.val;
        
    }
    
    
    public void pushall(TreeNode root){
        
        
        while(root != null){
            
            
            st.add(root);
            if(reverse == true){
                root = root.right;
            }else{
                root = root.left;
            }
        }
    }
    
    
}















class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        
        if(root == null){
            return false;
        }
        
        
        Bstiterator l1 = new Bstiterator(root , false);
        Bstiterator l2 = new Bstiterator(root , true);
        
        int i = l1.next();
        int j = l2.next();
        
        while(i < j){
            if(i + j == k){
                return true;
            }else{
                
                if(i + j  < k){
                    i = l1.next();
                }else{
                    j = l2.next();
                }
            }
            
        }
        
        
        
        
        
        return false;
        
    }
}