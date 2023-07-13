class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
     Arrays.sort(score , Comparator.comparingInt(x -> x[k]));
        
        
        int start = 0;
        int end = score.length-1;
        
        while(start < end){
            
            for(int i = 0; i < score[0].length; i++){
                
                int temp = score[start][i];
                score[start][i] = score[end][i];
                score[end][i] = temp;
                
                
            }
            
            start++;
            end--;
            
            
            
        }
        
        return score;
    }
}