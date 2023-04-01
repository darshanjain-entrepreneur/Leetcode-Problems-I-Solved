//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


class Pair{
    int first;
    int second;
    
    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
    
}

//User function Template for Java
class Solution {
    
    
    public void dfs(int node , int vis[] ,	ArrayList<ArrayList<Pair>> adj ,	Stack<Integer> st ){
        
        
        vis[node] = 1;
        
        
        for(int i = 0; i < adj.get(node).size(); i++){
            
            int v = adj.get(node).get(i).first;
            
            if(vis[v] == 0){
                
                dfs(v , vis , adj , st);
            }
            
            
            
            
        }
        
        st.add(node);
        
        
    }
    
    
    

	public int[] shortestPath(int N,int M, int[][] edges) {
	
	
	ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
	
	for(int i = 0; i < N; i++){
	    
	    ArrayList<Pair> temp = new ArrayList<>();
	    adj.add(temp);
	}
	
	for(int i = 0; i <M; i++){
	    
	    int u  = edges[i][0];
	    int v = edges[i][1];
	    int w = edges[i][2];
	    adj.get(u).add(new Pair(v , w));
	    
	    
	}
	Stack<Integer> st = new Stack<>();
int vis[] = new int[N];

for(int i = 0; i < N; i++){
    
    if(vis[i] == 0){
        dfs(i , vis , adj , st);
    }
}
	
	
	int dist[] = new int[N];
	
	Arrays.fill(dist , (int)1e9);
	
	dist[0] = 0;
	
	while(!st.isEmpty()){
	    
	    int node = st.peek();
	    st.pop();
	    
	    
	    for(int i = 0; i < adj.get(node).size(); i++){
	        
	        int v = adj.get(node).get(i).first;
	        int w = adj.get(node).get(i).second;
	        
	        if(dist[node] + w < dist[v]){
	            
	            dist[v] = dist[node] + w;
	        }
	        
	    }
	    
	    
	    
	    
	}
	
	
	
	
	for(int i = 0; i < N; i++){
	    
	    if(dist[i] == (int)1e9){
	        dist[i] = -1;
	    }
	}
	
	
	return dist;
	
	
	}
}