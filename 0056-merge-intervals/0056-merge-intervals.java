class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        List<int[]> ans = new ArrayList<>();
       
        Arrays.sort(intervals , (a ,b) -> (a[0] - b[0]));
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int rows[] : intervals){
           if(rows[0] <= end){
               
               end = Math.max(rows[1] , end);
               
               
           } else{
               
               ans.add(new int[]{start , end});
               start = rows[0];
               end = rows[1];
               
           }
            
            
            
        }
        
        ans.add(new int[]{start , end});
        return ans.toArray(new int[0][]);
        
    }
}