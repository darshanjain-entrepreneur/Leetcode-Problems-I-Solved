class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < deck.length; i++){
            
            q.add(deck[i]);
            map.put(deck[i] , i);
        }
        
        int answer[] = new int[deck.length];
        Arrays.sort(deck);
        int count = 0;
        int k = 0;
        
        while(!q.isEmpty()){
            
           if(count == 0){
               
           int a = q.poll();
               int i = map.get(a);
               
            answer[i] = deck[k];
               k++;
               count=1;
           }else{
               
               int a = q.poll();
               q.add(a);
               count = 0;
               
           }
            
            
            
            
            
        }
        
        return answer;
        
    }
}