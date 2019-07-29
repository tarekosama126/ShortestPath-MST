package ShortestPath_MST;

public class Source {

	public static void main(String[] args) {
		
		        /* Let us create the example graph discussed above */
		     	/*int graph[][] = new int[][] {{ 0, 0, 3, 2, 7, 0, 0, 0}, 
		                                      { 0, 0, 1, 0, 0, 0, 0, 0}, 
		                                      { 3, 1, 0, 0, 0, 1, 0, 0}, 
		                                      { 2, 0, 0, 0, 0, 1, 0, 0}, 
		                                      { 7, 0, 0, 0, 0, 0, 5, 0}, 
		                                      { 0, 0, 1, 1, 0, 0, 0, 2}, 
		                                      { 0, 0, 0, 0, 5, 0, 0, 9}, 
		                                      { 0, 0, 0, 0, 0, 2, 9, 0}}; */
		                                      
		     Dijkistra t = new Dijkistra(8); 
		     t.addEdge(0, 2, 3);
		     t.addEdge(0, 4, 7);
		     t.addEdge(0, 3, 2);
		     t.addEdge(1, 2, 1);
		     t.addEdge(2, 5, 1);
		     t.addEdge(3, 5, 1);
		     t.addEdge(5, 7, 2);
		     t.addEdge(6, 7, 9);
		     t.addEdge(4, 6, 5);
		     
		     t.dijkstra(t.getGraph(), 0); 
		     
		     
		     
		     
		     
		     MST t1 = new MST();
				int graph[][] = new int[][] { 
					{ 0, 2, 0, 6, 0 },
					{ 2, 0, 3, 8, 5 }, 
					{ 0, 3, 0, 0, 7 }, 
					{ 6, 8, 0, 0, 9 },
					{ 0, 5, 7, 9, 0 } };

				
				t1.primMST(graph);
		    } 

	}


