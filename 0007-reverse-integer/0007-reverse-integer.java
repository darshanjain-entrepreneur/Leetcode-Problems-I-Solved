class Solution {
    public int reverse(int x) {
        
        StringBuilder bb = new StringBuilder();
        StringBuilder cc = new StringBuilder();
        
        if(x < 0){
            x = -x;
            cc.append(x);
            cc.reverse();
            bb.append("-");
            bb.append(cc.toString());
            if(bb.length() > 0 && bb.charAt(bb.length()-1) == '-'){
                bb.delete(bb.length()-1 , bb.length());
            }
            
        }else{
            
            
              bb.append(x);
            bb.reverse();
        }
        
        System.out.println(bb);
       long d = Long.valueOf(bb.toString()); 
        
        if(d < (Integer.MIN_VALUE) || d > Integer.MAX_VALUE){
            
            return 0;
        }
        
        
        return (int)(d);
    }
}