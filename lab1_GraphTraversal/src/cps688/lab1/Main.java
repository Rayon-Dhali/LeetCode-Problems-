package cps688.lab1;

/**
 *
 * @author rayon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Main method where execution begins
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user to enter the number of vertices and edges
        System.out.print("Enter number of vertices and edges: ");
        int n = sc.nextInt(); // Read the number of vertices
        int e = sc.nextInt(); // Read the number of edges

        Graph g = new Graph(n); // Create a new Graph object with 'n' vertices

        System.out.println("Enter edges:"); // Prompt the user to enter the edges
        for (int i = 0; i < e; i++) { // Loop 'e' times to read all edges
            int a = sc.nextInt(); // Read the first vertex of the edge
            int b = sc.nextInt(); // Read the second vertex of the edge
            g.addEdge(a, b); // Add the edge between vertex 'a' and vertex 'b' to the graph
        }

        // Loop through each vertex to print its degree and adjacent vertices
        for (int i = 0; i < n; i++) {
            System.out.println("Degree of vertex " + i + ": " + g.degreeVertex(i)); // Print the degree of vertex 'i'
            g.printAdjVertices(i); // Print all adjacent vertices of vertex 'i'
        }

        // Perform and print Breadth-First Search traversal starting from vertex 0
        g.BFS(0);

        // Perform and print Depth-First Search traversal starting from vertex 0
        g.DFS(0);
    }
}
