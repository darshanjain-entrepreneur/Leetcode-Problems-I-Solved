
class BSTIterator {
    
    Stack<TreeNode> st = new Stack<>();
    

    public BSTIterator(TreeNode root) {
        
        
        pushall(root);
        
        
        
        
    }
    
    public int next() {
        
        TreeNode temp = st.pop();
        
        pushall(temp.right);
        return temp.val;
        
        
    }
    
    public boolean hasNext() {
        
        if(st.isEmpty()){
            return false;
        }
        return true;
        
    }
    
    public void pushall(TreeNode root){
        
        while(root!= null){
            
            st.add(root);
            root = root.left;
        }
        
    }
}

