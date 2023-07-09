class Solution {
    public boolean isBoomerang(int[][] points) {
        
        int a = points[0][0];
        int b = points[0][1];
        int c = points[1][0];
        int d = points[1][1];
        int e = points[2][0];
        int f = points[2][1];
        
        
        if(a == c && b ==d){
            return false;
        }
        
         if(a == e && b ==f){
            return false;
        }
        
         if(c == e && d ==f){
            return false;
        }
         double check1 = (double)(d-b);
            double check2 = (double)(f-d);
        
        if(a != c && c != e){
             check1 = (double)(d-b)/(double)(c-a);
            check2 = (double)(f-d)/(double)(e-c);
        }else if(a == c && c == e){
            return false;
        }else{
            
            return true;
        }
        
    
        
    
        
        System.out.println(check1);
        System.out.println(check2);
        
        if(check1 == check2){
            
            return false;
        }
        
        
        
        
        
        
        
       return true; 
        
    }
}