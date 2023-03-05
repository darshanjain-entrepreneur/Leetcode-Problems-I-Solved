//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution g = new Solution();
            printList(g.zigZag(head));
        }
    } 
}

// } Driver Code Ends




class Solution{
	public static Node zigZag(Node head){
       
       
       if(head == null || head.next == null){
           
           return head;
       }
       
       
      
     Node temp = new Node(0);
     Node res = temp;
     boolean flag = true;
  
       
       
       while(head != null && head.next != null){
           
           
           if(flag){
               
               if(head.data <= head.next.data){
                   
                temp.next = head;
             
                head = head.next;
                temp = temp.next;
                   
                  
               }else{
                   
                  Node temp1 = head.next;
                  head.next = head.next.next;
                  temp.next = temp1;
                  temp1 = head;
                  temp = temp.next;
                  
                 
                   
                   
               }
               
                flag = false;
               
           }else{
               
               if(head.data >= head.next.data){
                   
                 temp.next = head;
             
                head = head.next;
                temp = temp.next;
                
                
                   
               }else{
                   
                   Node temp2 = head.next;
                   head.next = head.next.next;
                   temp.next = temp2;
                   temp2.next = head;
                   temp = temp.next;
              
                   
               }
               
               
               
               
               
               
               flag = true;
           }
           
           
           
           
       }
       
       temp.next = head;
       
      return res.next;
       
    }
}