package Adjacence_Matrix;

public class AdjacenceMatrix {

	//	Adjacency Matrix = a 2D array to store 1's and 0's to represent edges
	//	Edge = is a connection between two nodes
	//	runtime complexity to check the edges = O(1)
	//	space complexity = O(n²)
	
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('E'));
		graph.addNode(new Node('F'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		System.out.println(graph.checkEdge(3, 1));
	}

}
