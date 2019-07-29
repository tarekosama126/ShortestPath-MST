package ShortestPath_MST;

public class Dijkistra {
		
	    private  int numberOfVertices ; 
	    private int[][] graph;
	    
	    public Dijkistra(int numberOfVertices) {
	    	this.numberOfVertices = numberOfVertices;
	    	this.graph = new int[numberOfVertices][numberOfVertices];
	    }
	    public void addEdge(int source,int destination,int weight) {
			graph[source][destination]=1*weight;
			graph[destination][source]=1*weight;
		}
	    
	    public int[][] getGraph() {
			return graph;
		}
		 
	    public int minDistance(int distance[], Boolean sptSet[]) 
	    { 
	        int min = Integer.MAX_VALUE, min_index = -1; 
	  
	        for (int v = 0; v < numberOfVertices; v++) 
	            if (sptSet[v] == false && distance[v] <= min) { 
	                min = distance[v]; 
	                min_index = v; 
	            } 
	  
	        return min_index; 
	    } 
	    void printPathFrom(int current,int parent[]) {
	    	
	    	if(current != parent[current]) printPathFrom(parent[current],parent);
	    	System.out.print(current + " ");
	    }
	    void printAllPaths(int parent[] , int distance[]) {
	    	for(int i = 0 ; i < numberOfVertices ; i++) {
	    		System.out.println("\nPath of " + i + " With cost " + distance[i] );
	    		printPathFrom(i,parent);
	    	}
	    }
	    void dijkstra(int graph[][], int begin) 
	    { 
	        int distance[] = new int[numberOfVertices]; 
	        int parent[] = new int[numberOfVertices];
	        Boolean Visited[] = new Boolean[numberOfVertices]; 
	        for (int i = 0; i < numberOfVertices; i++) { 
	            distance[i] = Integer.MAX_VALUE; 
	            Visited[i] = false; 
	            parent[i] = i;
	        } 
	        distance[begin] = 0; 
	        for (int count = 0; count < numberOfVertices - 1; count++) { 
	        	int u = minDistance(distance, Visited); 
	        	Visited[u] = true; 
	        	for (int v = 0; v < numberOfVertices; v++) {
	        	if (!Visited[v] && graph[u][v] != 0 &&  
	                    distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]) {
	                    distance[v] = distance[u] + graph[u][v];
	                	parent[v] = u;
	                }
	               }
	        } 
	       printAllPaths(parent,distance);
	    } 
}

