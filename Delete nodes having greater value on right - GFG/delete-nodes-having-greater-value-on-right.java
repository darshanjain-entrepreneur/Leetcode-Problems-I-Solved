//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends



class Solution
{
    
    
    Node reverse(Node head){
        
        
        Node prev = null;
        Node pre = head;
        Node fut = pre.next;
        
        while(pre != null){
            
            pre.next = prev;
            prev = pre;
            pre = fut;
            if(fut != null){
                fut = fut.next;
            }
            
            
        }
        
        return prev;
        
    }
    
    
    
    
    
    Node compute(Node head)
    {
       
       if(head == null || head.next == null){
           return head;
       }
       
       if(head.next.next == null){
           
           if(head.data >= head.next.data){
               return head;
           }else{
               return head.next;
           }
           
       }
       
       
       
     Node head1 = reverse(head);
     Node temp1 = head1;
     
     
     while(head1 != null && head1.next != null){
         
         if(head1.data > head1.next.data){
             
             
             head1.next = head1.next.next;
             
             
         }else{
             
             head1 = head1.next;
             
             
         }
      
         
         
     }
     
     Node head2 = reverse(temp1);
     
     return head2;
       
       
    }
}
  