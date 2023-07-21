class LFUCache {
    
    TreeMap<Integer , Integer> map1 = new TreeMap<>();
    TreeMap<Integer ,ArrayList<Integer>> map2 = new TreeMap<>();
    TreeMap<Integer , Integer> map3 = new TreeMap<>();
    
    int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        
        if(map1.containsKey(key)){
            
            int freq = map3.get(key);
            map3.put(key , freq+1);
            int indexoff = map2.get(freq).indexOf(key);
            map2.get(freq).remove(indexoff);
            if(map2.containsKey(freq+1)){
                map2.get(freq+1).add(key);
                
            }else{
             map2.put(freq+1 , new ArrayList<Integer>());
                map2.get(freq+1).add(key);
                
            }
    
            
            return map1.get(key);
        }else{
            
            return -1;
        }
        
        
        
    }
    
    public void put(int key, int value) {
        
        if(map1.containsKey(key)){
            
            map1.put(key , value);
              int freq = map3.get(key);
            map3.put(key , freq+1);
            int indexof = map2.get(freq).indexOf(key);
            map2.get(freq).remove(indexof);
             if(map2.containsKey(freq+1)){
                map2.get(freq+1).add(key);
                
            }else{
             map2.put(freq+1 , new ArrayList<Integer>());
                map2.get(freq+1).add(key);
                
            }
            
        }else{
            
            if(map1.size() == capacity){
                
                for(int i : map2.keySet()){
                    
                    if(map2.get(i).size() > 0){
                        
                      int a = map2.get(i).get(0);
                    map2.get(i).remove(0);
                        map3.remove(a);
                        map1.remove(a);
                        map1.put(key , value);
                        map3.put(key , 1);
                      map2.get(1).add(key);
                       
                        break;
                    }
                    
                }
                
                
                
                
                
            }else{
                
                map1.put(key , value);
                map3.put(key , 1);
                if(map2.containsKey(1)){
                    
                    map2.get(1).add(key);
                }else{
                    
                    map2.put(1 , new ArrayList<Integer>());
                    map2.get(1).add(key);
                }
                
                
                
                
            }
            
            
            
            
        }
        
    }
}

