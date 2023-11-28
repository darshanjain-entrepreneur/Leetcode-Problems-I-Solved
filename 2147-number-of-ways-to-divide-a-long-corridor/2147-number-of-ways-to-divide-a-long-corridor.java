class Solution {
    public int numberOfWays(String co) {
        
        
        long ans = 1;
        
        
        int count = 0;
        
        
        ArrayList<Integer> ll = new ArrayList<>();
        ArrayList<Integer> ss = new ArrayList<>();
        
        for(int i = 0; i < co.length(); i++ ){
            
            
           char a = co.charAt(i);
            
            if(a == 'S'){
                
                if(count == 0){
                    ll.add(i);
                    count++;
                }else{
                    
                    ss.add(i);
                    count = 0;
                    
                }
                
            }
            
            
            
        }
        
        if(ll.size() != ss.size()){
            
            return 0;
        }
        
        int mod = (int)(1e9)+7;
        
        if(count == 1){
            
            ll.remove(ll.size()-1);
        }
        
        for(int i = 0; i < ll.size()-1; i++){
            
            
            int index1 = ss.get(i);
            int index2 = ll.get(i+1);
            
         long b = (index2- index1)%mod;
            
            ans = (ans*(b))%mod;
            
            
            
            
            
        }
       
        
        if(ans == 0 && ss.size() > 0){
            ans = 1;
        }
        
        if(ss.size() == 0){
            ans = 0;
        }
        
        return (int)(ans);
        
    }
}