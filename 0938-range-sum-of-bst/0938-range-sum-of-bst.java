
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
             int arr[] = new int[1];
        
        find(root , low , high , arr);
        return arr[0];
    }
    
    public void find(TreeNode root ,int low , int high , int arr[]){
        
        if(root == null){
            return;
        }
        
        if(root.val <= high && root.val >= low){
            
            arr[0] = arr[0] + root.val;
        }
        
        find(root.left , low , high , arr);
        find(root.right , low , high , arr);
    }
}