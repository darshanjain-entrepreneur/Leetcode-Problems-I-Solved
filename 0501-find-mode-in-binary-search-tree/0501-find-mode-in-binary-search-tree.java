
class Solution {
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        solve(root , map);
        
        ArrayList<Integer> ll = new ArrayList<>();
        
        
        int max =0;
    
        
        
        for(int i : map.keySet()){
            
            if(map.get(i) > max){
                
            
                ll.clear();
                max = map.get(i);
                ll.add(i);
                
                
            }else if(max == map.get(i)){
                ll.add(i);
            }
            
            
        }
        
        
        int arr[] = new int[ll.size()];
        
        for(int i = 0; i < ll.size(); i++){
            
            
            arr[i] = ll.get(i);
        }
        
        
        return arr;
    }
    
    public void solve(TreeNode root , HashMap<Integer , Integer> map ){
        
        if(root == null){
            return;
        }
        
        
        
        
        
        int value = root.val;
       if(map.containsKey(value)){
           map.put(value , map.get(value)+1);
       }else{
           
           map.put(value , 1);
       }
        
        
        
        solve(root.left , map);
        solve(root.right , map);
        
        
    }
}