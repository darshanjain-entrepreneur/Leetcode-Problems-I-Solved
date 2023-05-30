class RandomizedSet {
    ArrayList<Integer> ans = new ArrayList<>();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        
        if(ans.contains(val)){
            return false;
        }else{
            ans.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        
     if(ans.contains(val)){
         
         int i = ans.indexOf(val);
         ans.remove(i);
         
         
         return true;
         
     }else{
         
         return false;
     }
        
    }
    
    public int getRandom() {
        
        int a = (int)(Math.random()*ans.size());
        
        return ans.get(a);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */