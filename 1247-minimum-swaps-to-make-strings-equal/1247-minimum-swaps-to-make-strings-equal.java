class Solution {
    public int minimumSwap(String s1, String s2) {

     int x = 0;
        int y = 0;
        
        int xandy = 0;
        int yandx = 0;
        
   for(int i = 0; i < s1.length(); i++){
       
       char ch1 = s1.charAt(i);
       char ch2 = s2.charAt(i);
       
       if(ch1 == ch2){
           
           if(ch1 == 'x'){
               x = x+2;
           }else{
               y = y+2;
           }
           
       }else{
           
           if(ch1 == 'x'){
               xandy++;
               x++;
               y++;
           }else{
               yandx++;
               x++;
               y++;
           }
           
           
       }
       
   }
       
        if(x%2 != 0 || y %2 != 0){
            return -1;
        }
        
        if(xandy%2 != 0){
           xandy =  xandy+1;
        }
        
        xandy = xandy/2;
        
        if(yandx%2 != 0){
            yandx = yandx+1;
        }
        
        yandx = yandx/2;
        
        return xandy + yandx;
        
    }
}