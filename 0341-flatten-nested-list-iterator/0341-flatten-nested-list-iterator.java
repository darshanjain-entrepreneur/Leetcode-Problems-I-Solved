
public class NestedIterator implements Iterator<Integer> {
    
    
    Stack<NestedInteger> st;

    public NestedIterator(List<NestedInteger> nestedList) {
        int n = nestedList.size();
        st = new Stack<>();
        
        for(int i = n-1; i>= 0; i--){
            
            st.add(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        
        int num = st.peek().getInteger();
        st.pop();
        return num;
        
    }

    @Override
    public boolean hasNext() {
        
        if(st.isEmpty()){
            return false;
        }
        
        while(!st.isEmpty()){
            
            NestedInteger cur = st.peek();
            
            if(cur.isInteger()){
                return true;
            }
            
            st.pop();
            
           List<NestedInteger> ll  = cur.getList();
            for(int i = ll.size()-1; i>= 0; i--){
                
                st.add(ll.get(i));
                
            }
            
        }
        return false;
    }
}

