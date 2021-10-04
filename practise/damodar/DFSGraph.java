
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

class DFSGraph{

	LinkedList<Integer> adj[];

	DFSGraph(int v){

		adj =  new LinkedList[v];

		for (int i = 0 ; i < v ; i++ ) {
			
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source , int dest){

		adj[source]. add(dest);
		adj[dest].add(source);
	}

	public boolean DFS(int source , int dest ){

		boolean visisted[] = new boolean[adj.length];

		visisted[source] = true;

		Stack<Integer> st = new Stack<>();

		st.push(source);

		while(!st.isEmpty()){

			int cur = st.pop();

			if(cur == dest){

				return true;
			}

			for (int neighbour : adj[cur] ) {
				
				if(!visisted[neighbour]){

					visisted[neighbour] = true;
					st.push(neighbour);
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter vertex");
		int v = sc.nextInt();

		System.out.println("Enter edge");
		int e = sc.nextInt();

		DFSGraph g = new DFSGraph(v);

		System.out.println(" Enter Source and destination");

		for (int  i = 0  ; i < e ; i++) {
			
			int source = sc.nextInt();
			int dest = sc.nextInt();

			g.addEdge(source , dest);

		}

		boolean ans = g.DFS(0 , 2);

			if(ans == true){

				System.out.println(" Yes it is possible");
			}else{

				System.out.println(" No it is not possible");
			}
		
	}
}