


class Solution {
    
    
 public List<String> topKFrequent(String[] words, int k) {

     List<String> st = new ArrayList<>();
     HashMap<String , Integer> map = new HashMap<>();
     
     for(String s : words){
         
         
         map.put(s,map.getOrDefault(s , 0) + 1);
         
     }
     
     
     PriorityQueue<Map.Entry<String , Integer>> pq = new PriorityQueue<>(
     (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()):a.getValue()-b.getValue()    
     );
     
     for(Map.Entry<String , Integer> m : map.entrySet()){
         
         pq.offer(m);
         
         if(pq.size() > k){
             pq.poll();
         }
         
         
     }
     
     
     while(!pq.isEmpty()){
         st.add(0 , pq.poll().getKey());
     }
     
     return st;
        
    }
}