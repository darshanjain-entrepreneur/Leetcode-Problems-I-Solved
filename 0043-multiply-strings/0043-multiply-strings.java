



class Solution {
    public String multiply(String num1, String num2) {
        
    
        int arr[] = new int[num1.length() + num2.length()+5];
        
        int n = num1.length();
        int m = num2.length();
        
        String a = "";
        String b = "";
        
        if(n >= m ){
            
            a = num1;
            b = num2;
        }else{
            
            a = num2;
                b = num1;
        }
        
     
      
            
            
            int k = arr.length;
            
            
            for(int j = b.length()-1; j>=0; j--){
                int carry = 0;
                k--;
                int h = k;
                for(int y = a.length()-1; y >=0; y--){
                    
                    int n1 = (int)(b.charAt(j) - '0');
                    int n2 = (int)(a.charAt(y) - '0');
                    
                    int n3 = n1*n2 + carry;
                    carry = 0;
                    int n4 = n3%10;
                    carry = n3/10;
                   
                   int  g = h;
                    
                    while(arr[g] + n4 >= 10){
                        
                        int n5 = (arr[g]+n4)/10;
                        arr[g] = (arr[g]+n4)%10;
                        g--;
                        n4 = n5;
                        
                    }
                    
                    arr[g] = arr[g]+n4;
                    
                    if(y == 0){
                    g = h-1;
                        while(arr[g]+carry >= 10){
                        int n7 = (arr[g]+carry)/10;
                            arr[g] = (arr[g]+carry)%10;
                            g--;
                            carry = n7;
                        }
                        arr[g] = arr[g]+carry;
                    }
                    h--;
                }
                
                
                
            }
            
           
            
 
        StringBuilder ans = new StringBuilder();
        
    boolean check = false;
        
        for(int i = 0; i < arr.length; i++){
            
            if(check == false && arr[i] == 0){
                continue;
            }
            
            if(arr[i] != 0){
                check = true;
            }
            ans.append(arr[i]);
        }
        
        if(ans.length() == 0){
            ans.append("0");
        }
        return ans.toString();
        
    }
}