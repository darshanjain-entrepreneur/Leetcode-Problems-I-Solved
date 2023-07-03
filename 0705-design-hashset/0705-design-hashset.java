class MyHashSet {
    
    ArrayList<Integer> ans;

    public MyHashSet() {
        ans = new ArrayList<>();
    }
    
    public void add(int key) {
      if(ans.contains(key)){
          
      }else{
          
          ans.add(key);
      }
    }
    
    public void remove(int key) {
       int a =  ans.indexOf(key);
       if(a == -1){
           
       }else{
           ans.remove(a);
       }
    }
    
    public boolean contains(int key) {
      if(ans.contains(key)){
          return true;
      }else{
          return false;
      }
    }
}

