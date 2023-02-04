class Solution {
    public boolean isPalindrome(String s) {
        
            String s1= s.trim().toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if((c>=48 && c<=57)||(c>=97 && c<=122)){
                str.append(c);
            }
        }

        int start= 0;
        int end= str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++; end--;
        }

        return true;
    }
}