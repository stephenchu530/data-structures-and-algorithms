/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BreadthFirstGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BreadthFirst<T> {

    private ArrayList<GraphNode<T>> nodes;

    public BreadthFirst() {
        this.setNodes(new ArrayList<GraphNode<T>>());
    }

    public ArrayList<T> breadthFirst(GraphNode<T> node) {
        ArrayList<T> results = new ArrayList<>();
        HashSet<GraphNode<T>> visited = new HashSet<>();
        ArrayList<GraphNode<T>> queue = new ArrayList<>();
        GraphNode<T> tmpNode;


        if (this.getNodes().contains(node)) {
            visited.add(node);
            queue.add(node);
            while (!queue.isEmpty()) {
                tmpNode = queue.remove(0);
                for (GraphNode<T> seeNode: tmpNode.getNeighbors().keySet()) {
                    if (visited.add(seeNode)) {
                        queue.add(seeNode);
                    }
                }
                results.add(tmpNode.getValue());
            }
        }

        return results;
    }

    public GraphNode addNode(T value) {
        GraphNode<T> newNode = new GraphNode<T>(value);
        ArrayList<GraphNode<T>> nodes = this.getNodes();
        nodes.add(newNode);
        this.setNodes(nodes);
        return newNode;
    }

    public void addEdge(GraphNode<T> nodeA, GraphNode<T> nodeB, int weight) {
        if (this.getNodes().contains(nodeA) && this.getNodes().contains(nodeB)) {
            nodeA.addNeighbor(nodeB, weight);
            nodeB.addNeighbor(nodeA, weight);
        }
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors(GraphNode<T> node) {
        return node.getNeighbors();
    }

    public int size() {
        return this.getNodes().size();
    }

    public ArrayList<GraphNode<T>> getNodes() {
        return new ArrayList<GraphNode<T>>(this.nodes);
    }

    public void setNodes(ArrayList<GraphNode<T>> nodes) {
        this.nodes = new ArrayList<GraphNode<T>>(nodes);
    }
}

class GraphNode<T> {

    private T value;
    private HashMap<GraphNode<T>, Integer> neighbors;

    public GraphNode(T value) {
        this.setValue(value);
        this.setNeighbors(new HashMap<>());
    }

    public void addNeighbor(GraphNode<T> node, Integer weight) {
        HashMap<GraphNode<T>, Integer> tmpHM = this.getNeighbors();
        tmpHM.put(node, weight);
        this.setNeighbors(tmpHM);
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors() {
        return new HashMap<>(this.neighbors);
    }

    public void setNeighbors(HashMap<GraphNode<T>, Integer> neighbors) {
        this.neighbors = new HashMap<>(neighbors);
    }
}