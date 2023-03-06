class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        
        q1.add(x);
    }
    
    public int pop() {
        
        if(q1.isEmpty()){
            return -1;
        }
        
        if(q1.size() == 1){
            return q1.poll();
        }
       while(q1.size() > 1){
           
           q2.add(q1.poll());
       } 
        
        int ans = q1.poll();
        
        while(!q2.isEmpty()){
            
            q1.add(q2.poll());
        }
        return ans;
        
    }
    
    public int top() {
        
        if(q1.isEmpty()){
            return -1;
        }
        
        if(q1.size() == 1){
            return q1.peek();
        }
        
        while(q1.size() > 1){
            
            q2.add(q1.poll());
            
        }
        
        int ans = q1.peek();
        q2.add(q1.poll());
        while(!q2.isEmpty()){
            
            q1.add(q2.poll());
            
            
        }
        
        return ans;
        
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */