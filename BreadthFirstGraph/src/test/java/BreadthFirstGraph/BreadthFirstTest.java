/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BreadthFirstGraph;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BreadthFirstTest {

    public BreadthFirst<Integer> testGraph;

    @Before
    public void setUpGraph() {
        this.testGraph = new BreadthFirst<>();
        this.testGraph.addNode(11);
        this.testGraph.addNode(22);
        this.testGraph.addNode(33);
        GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
        GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
        GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);
        this.testGraph.addEdge(node1, node2, 22);
        this.testGraph.addEdge(node1, node3, 33);
    }

    @Test
    public void testBreadthFirst() {
        GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
        GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
        GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);

        System.out.println(this.testGraph.breadthFirst(node1));
        System.out.println(this.testGraph.breadthFirst(node2));
        System.out.println(this.testGraph.breadthFirst(node3));
    }
}