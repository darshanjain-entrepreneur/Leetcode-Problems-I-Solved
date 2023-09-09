class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int arr[] = new int[n];
        
        
        for(int nums[] : bookings){
            
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];
            
        for(int start = a; start <= b; start++){
            
            arr[start-1] = arr[start-1] + c;
            
        }
            
            
            
        }
        
        
        
        return arr;
    }
}