
class Pair{
    
    String first;
    int second;
    public Pair(String first , int second){
        this.first = first;
        this.second = second;
    }
}






class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(beginWord ,1 ));
        
        Set<String> st = new HashSet<>();
        
        for(int i = 0; i < wordList.size(); i++){
            
            st.add(wordList.get(i));
            
        }
        
        
        st.remove(beginWord);
        
        while(!q.isEmpty()){
            
            String word = q.peek().first;
            int steps = q.peek().second;
            q.poll();
            
            if(word.equals(endWord)){
                
                return steps;
            }
            
            for(int i = 0; i < word.length(); i++){
                
                for(char ch = 'a'; ch <= 'z'; ch++){
                    
                    char[] wordchar = word.toCharArray();
                    
                    wordchar[i] = ch;
                    
                    String replaceword = new String(wordchar);
                    
                    if(st.contains(replaceword)){
                        
                        st.remove(replaceword);
                        q.add(new Pair(replaceword , steps  +1));
                    }
                    
                    
                }
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        
        return 0;
        
    }
}