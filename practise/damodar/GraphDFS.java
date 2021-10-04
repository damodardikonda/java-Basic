import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
class GraphDFS{
	
	LinkedList<Integer> adj[] ;

	GraphDFS(int v){

		adj = new LinkedList[v];

		for (int i = 0 ; i < v ; i++ ) {
			
			adj[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int source , int destination){

		adj[source].add(destination);
		adj[destination].add(source);
	}

	public void DFSSearch(int source , int destination){

		boolean visited[] = new boolean[adj.length];

		Stack<Integer> stk = new Stack<>();

		stk.push(source);

		while(!stk.isEmpty()){

			int curr = stk.pop();

			if(curr == destination){
				System.out.println("Path is possible");
				break;
			}

			for(int neighbour : adj[curr]){

				if(!visited[neighbour]){

					visited[neighbour] = true;
					stk.push(neighbour);
				}
			}
		}
	}
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the vertex");
		int v = sc.nextInt();
		GraphDFS fd = new GraphDFS(v);

		System.out.println("Enter edges");
		int e = sc.nextInt();

		for (int i = 0 ; i < e ; i++) {
			
			int source = sc.nextInt();
			int destination = sc.nextInt();

			fd.addEdge(source , destination);
		}


	fd.DFSSearch(1,7);
}
	}
