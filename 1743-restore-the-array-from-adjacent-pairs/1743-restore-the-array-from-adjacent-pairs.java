class Solution {
    public int[] restoreArray(int[][] arr) {
        
        
      HashMap<Integer , Integer> map = new HashMap<>();
         HashMap<Integer , Integer> map1 = new HashMap<>();
         HashMap<Integer , Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            int a = arr[i][0];
            int b = arr[i][1];
            
            if(map.containsKey(a) == false){
                map.put(a , 0);
            }
            
            map.put(a , map.get(a)+1);
            
            
                 if(map.containsKey(b) == false){
                map.put(b , 0);
            }
            
            map.put(b , map.get(b)+1);
            
            if(map1.containsKey(a)){
                map2.put(a,b);
            }else{
                map1.put(a,b);
            }
            
                 
            if(map1.containsKey(b)){
                map2.put(b,a);
            }else{
                map1.put(b,a);
            }
            
            
        }
        
        int n = arr.length+1;
        int start = -1;
        int end = -1;
        int brr[] = new int[n];
        
        for(int i : map.keySet()){
            
            if(start == -1 && map.get(i) == 1){
                start++;
                brr[start]=i;
               
                start++;
            }else if(end == -1 && map.get(i)==1){
                end = n-1;
                brr[end]=i;
                
                end--;
            }
            
            
        }
        
        
        
        
        while(start <= end){
            
            int a = -1;
            System.out.println(start);
            if(map.containsKey(map1.get(brr[start-1])) == true){
                
                a = map1.get(brr[start-1]);
                
            }else{
                
                a = map2.get(brr[start-1]);
            }
            
            int b = -1;
              if(map.containsKey(map1.get(brr[end+1])) == true){
                
                b = map1.get(brr[end+1]);
            }else{
                
                b = map2.get(brr[end+1]);
            }
            
            
            
            map.remove(brr[start-1]);
            map.remove(brr[end+1]);
            
            
            if(start == end){
                brr[start] = a;
                break;
            }else{
                
                brr[start] = a;
                brr[end] = b;
                start++;
                end--;
            }
            
            
            
        }
        
        
        
        
        
        return brr;
        
    }
}