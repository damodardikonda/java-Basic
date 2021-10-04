 import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class BFSGraph{

	LinkedList<Integer> adj[] ;

	BFSGraph(int v){

		adj = new LinkedList[v];

		for (int i = 0 ; i < v ; i++) {
			
			adj[i] = new LinkedList<Integer>();
		}
	}

	void addedge(int source , int destination){

		adj[source].add(destination);
		adj[destination].add(source);
	}

	public void BFSSearch(int source , int destination){

		boolean visited [] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(source);
		visited[source] = true;
		parent[source] = -1;

		while(!q.isEmpty()){

			int curr = q.poll();

			if(curr == destination)
					break;
			
			for(int neighbour : adj[curr]){

				if(!visited[neighbour]){

					q.add(neighbour);
					parent[neighbour] = curr;
					visited[neighbour] = true;
				}
			}
	}

	int count = 0 ;
	int curr = destination;

	while(curr!= -1){

		System.out.println("Curr -> " + curr);
		count++;
		curr = parent[curr];
	}

	System.out.println("Minimum distance is = " +  count);
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vertex");

		int v = sc.nextInt();

		System.out.println("Enter the Edge");

		int e = sc.nextInt();
			BFSGraph bg = new BFSGraph(v);
	
		for (int i = 0 ; i < e ; i++ ) {
		 	
		 	int source = sc.nextInt(); 
		 	int destination = sc.nextInt();

		 	bg.addedge( source , destination);
		 } 

		 	bg.BFSGraph(1,8);
	}
}