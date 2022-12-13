//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    
    public static String reverseWord(String str)
    {
    String reverse = "";
    int n = str.length();
    int i = 0;
    while(i < n){
        char ch = str.charAt(i);
        reverse = ch + reverse + "";
        
        i++;
        
    }
    return reverse;
    }
}