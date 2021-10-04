import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Graph{
	
	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	

	public void addEdge(int source , int destination){

		adj[source].add(destination);
		adj[destination].add(source);
	}


	public void BFSSearch(int source , int destination){

		boolean visited[] = new boolean[adj.length];
		int parent [] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
			q.add(source);
		parent[source] = -1;
		visited[source] = true;

		while(!q.isEmpty()){

			int cur  =  q.poll();

			if(cur == destination) 
				break;

			for (int neighbor : adj[cur] ) {
				
				if(!visited[neighbor]){

					visited[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}

		int cur = destination;
		int distance = 0;
		
		while(parent[cur] != -1){

			System.out.print(cur  +"-> ");
			distance++;
			cur = parent[cur];
		}
			System.out.println();

			System.out.println(" distance of BST graph is = " + distance);
		}
		
 	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

System.out.println("Enter Vertices");
		int v = sc.nextInt();

		 Graph g = new Graph(v);

System.out.println("Enter edge");
		 int e = sc.nextInt();

		 	System.out.println("Enter " + e +" edge");
		 for (int i = 0 ; i < e ; i++ ) {

		 	int source = sc.nextInt();
		 	int destination = sc.nextInt();

		 	g.addEdge(source , destination);
		 }

		 g.BFSSearch(0,3);
	}

}	
