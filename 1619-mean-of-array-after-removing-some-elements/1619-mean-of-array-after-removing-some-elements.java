class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        
        double a = ((double)(5)/(double)(100))*((double)(arr.length));
        
        int b  = (int)(a);
        
        int sum = 0;
        int start = 0 + b;
        int end = arr.length-1 - b;
        
        for(int i = start; i <= end; i++){
            sum = sum + arr[i];
            
        }
        
        int d = arr.length - (2*b);
        
        double e = (double)(sum)/(double)(d);
        return e;
        
    }
}