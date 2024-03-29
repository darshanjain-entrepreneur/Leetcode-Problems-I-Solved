//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends



class Solution{
    Node divide(int N, Node head){
      
      
      Node temp  = head;
      
      Node odd = null;
      int countodd = 0;
      Node even = null;
      int counteven = 0;
      Node evenstart = null;
      Node oddstart = null;
      
      
      while(temp != null){
          
          if(temp.data % 2 == 0){
              
              if(counteven == 0){
                  
                  even = new Node(temp.data);
                  evenstart = even;
                  temp = temp.next;
                  counteven = 1;
              }else{
                  
                  even.next = new Node(temp.data);
                  temp = temp.next;
                  even = even.next;
                  
              }
              
              
          }else{
              
              
              if(countodd == 0){
                  
                  odd = new Node(temp.data);
                  oddstart = odd;
                  temp = temp.next;
                  countodd = 1;
              }else{
                  
                  odd.next = new Node(temp.data);
                  temp = temp.next;
                  odd = odd.next;
                  
                  
              }
              
              
              
              
              
              
              
              
          }
          
          
          
          
          
          
          
      }
      
      
      if(evenstart == null){
          
          return oddstart;
      }
     
      
      even.next = oddstart;
      return evenstart;
      
      
    }
}