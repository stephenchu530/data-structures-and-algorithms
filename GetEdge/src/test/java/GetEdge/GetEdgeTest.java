/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GetEdge;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetEdgeTest {
    public GetEdge<String> testGraph;

    @Before
    public void setUpGraph() {
        this.testGraph = new GetEdge<String>();
        this.testGraph.addNode("Pandora");
        this.testGraph.addNode("Arendelle");
        this.testGraph.addNode("Metroville");
        this.testGraph.addNode("Monstropolis");
        this.testGraph.addNode("Narnia");
        this.testGraph.addNode("Naboo");

        GraphNode<String> pandora = testGraph.findNode(this.testGraph, "Pandora");
        GraphNode<String> arendelle = testGraph.findNode(this.testGraph, "Arendelle");
        GraphNode<String> metroville = testGraph.findNode(this.testGraph, "Metroville");
        GraphNode<String> monstropolis = testGraph.findNode(this.testGraph, "Monstropolis");
        GraphNode<String> narnia = testGraph.findNode(this.testGraph, "Narnia");
        GraphNode<String> naboo = testGraph.findNode(this.testGraph, "Naboo");

        this.testGraph.addEdge(pandora, arendelle, 150);
        this.testGraph.addEdge(pandora, metroville, 82);
        this.testGraph.addEdge(arendelle, metroville, 99);
        this.testGraph.addEdge(arendelle, monstropolis, 42);
        this.testGraph.addEdge(metroville, monstropolis, 105);
        this.testGraph.addEdge(metroville, narnia, 37);
        this.testGraph.addEdge(metroville, naboo, 26);
        this.testGraph.addEdge(monstropolis, naboo, 73);
        this.testGraph.addEdge(narnia, naboo, 250);
    }

    @Test
    public void testOne() {
        String[] result = this.testGraph.getEdge(this.testGraph, new String[]{"Metroville", "Pandora"});

        assertArrayEquals("Should be equals",
                new String[]{"true", "82"},
                result
        );
    }

    @Test
    public void testTwo() {
        String[] result = this.testGraph.getEdge(this.testGraph, new String[]{"Arendelle", "Monstropolis", "Naboo"});

        assertArrayEquals("Should be equals",
                new String[]{"true", "115"},
                result
        );
    }

    @Test
    public void testThree() {
        String[] result = this.testGraph.getEdge(this.testGraph, new String[]{"Naboo", "Pandora"});

        assertArrayEquals("Should be equals",
                new String[]{"false", "0"},
                result
        );
    }

    @Test
    public void testFour() {
        String[] result = this.testGraph.getEdge(this.testGraph, new String[]{"Narnia", "Arendelle", "Naboo"});

        assertArrayEquals("Should be equals",
                new String[]{"false", "0"},
                result
        );
    }
}