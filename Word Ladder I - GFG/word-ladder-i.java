//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Pair{
    String name;
    int distance;
    Pair(String name  , int distance){
        this.name = name;
        this.distance = distance;
        
    }
    
}


class Solution
{
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
       Set<String> s = new HashSet<>();
       for(int i = 0 ; i < wordList.length; i++){
           s.add(wordList[i]);
       }
       Queue<Pair> queue = new LinkedList<>();
       s.remove(startWord);
       queue.add(new Pair(startWord , 1));
       while(!queue.isEmpty()){
           String word = queue.peek().name;
           int steps = queue.peek().distance;
           
           if(word.equals(targetWord)){
               return steps;
           }
           
           
           queue.poll();
           for(int i = 0 ; i < word.length(); i++){
               
               for(char ch = 'a'; ch <= 'z'; ch++){
                   
                   char[] replaceword = word.toCharArray();
                   replaceword[i] =ch; 
                   String replace = new String(replaceword);
                   if(s.contains(replace) == true){
                       s.remove(replace);
                       queue.add(new Pair(replace , steps + 1));
                       
                   }
                   
               }
               
               
               
           }
           
           
           
           
           
       }
       
       
       
       
       
       
       
       return 0;
       
       
    }
}