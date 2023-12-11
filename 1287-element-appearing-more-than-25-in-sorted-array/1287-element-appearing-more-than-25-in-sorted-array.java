class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        
     int a = 25*n;
        
        a = a/100;
        a++;
        
        int ans = -1;
        int max = 0;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
           
            if(map.get(arr[i]) > max){
                max = map.get(arr[i]);
                ans = arr[i];
            }
            
        }
        
        return ans;
     
    }
}