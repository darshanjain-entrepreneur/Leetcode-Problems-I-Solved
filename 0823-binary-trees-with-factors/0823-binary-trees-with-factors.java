class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
        
        int n = arr.length;
        
        HashMap<Integer , Long> map = new HashMap<>();
        
        Arrays.sort(arr);
        
        map.put(arr[0] , (long)1);
        
        for(int i = 1 ; i< n; i++){
            int root = arr[i];
            map.put(root , (long)1);
            for(int j = 0; j < i; j++){
                
                int lc = arr[j];
                
                if(root%lc == 0 && map.containsKey(root/lc)){
                    
                    map.put(root , map.get(root) +  (long)map.get(lc)*(long)map.get(root/lc) );
                }
                
                
            }
            
        }
        
        long result = 0;
        for(int i : map.keySet()){
            result = result + map.get(i);
        }
        
        int M = (int)(1e9) + 7;
        return (int)(result%M);
    }
}