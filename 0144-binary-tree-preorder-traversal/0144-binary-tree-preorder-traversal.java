
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        if(root == null){
            return ans;
        }
        
        st.add(root);
        
        while(!st.isEmpty()){
            TreeNode node =   st.pop();
            ans.add(node.val);
            
            if(node.right != null){
               st.add(node.right);
            }
            
            if(node.left != null){
                st.add(node.left);
            }
            
        
        }
        
        return ans;
        
    }
}