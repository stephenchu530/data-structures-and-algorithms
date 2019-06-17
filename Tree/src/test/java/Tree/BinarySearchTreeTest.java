package Tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class BinarySearchTreeTest {
    public BinarySearchTree<Integer> testBst;

    @Before
    public void setUpBst() {
        this.testBst = new BinarySearchTree<>();
    }

    @After
    public void tearDownBst() {
        this.testBst = null;
    }

    @Test
    public void testInstantiate() {
        BinarySearchTree<Integer> testBstInt = new BinarySearchTree<>();
        BinarySearchTree<Character> testBstChar = new BinarySearchTree<>();
        BinarySearchTree<String> testBstTString = new BinarySearchTree<>();
    }

    @Test
    public void testContainsOnEmptyBst() {
        assertFalse("Should be false",
                this.testBst.contains(1)
        );
        assertFalse("Should be false",
                this.testBst.contains(46)
        );
        assertFalse("Should be false",
                this.testBst.contains(-34)
        );
    }

    @Test
    public void TestAddToBst() {
        this.testBst.add(0);
        this.testBst.add(-3);
        this.testBst.add(45);
        this.testBst.add(9384);
        this.testBst.add(-23);

        // This should not error out nor should it be added
        this.testBst.add(0);

    }

    @Test
    public void testContainsOne() {
        this.testBst.add(-56);
        assertTrue("Should return true",
                this.testBst.contains(-56)
        );
        assertFalse("Should return true",
                this.testBst.contains(56)
        );
    }

    @Test
    public void testContainsMany() {
        this.testBst.add(0);
        this.testBst.add(-3);
        this.testBst.add(45);
        this.testBst.add(-56);
        this.testBst.add(9384);
        this.testBst.add(-23);
        this.testBst.add(-56);

        // This should not error out nor should it be added
        this.testBst.add(0);

        assertTrue("Should return true",
                this.testBst.contains(-56)
        );
        assertFalse("Should return true",
                this.testBst.contains(56)
        );
        assertTrue("Should return true",
                this.testBst.contains(0)
        );
        assertTrue("Should return true",
                this.testBst.contains(45)
        );
        assertTrue("Should return true",
                this.testBst.contains(-23)
        );
        assertTrue("Should return true",
                this.testBst.contains(9384)
        );
    }

    @Test
    public void testPreOrderSingleItem() {
        this.testBst.add(0);
        this.testBst.add(0);

        assertEquals("Should be a single item in the array list",
                new ArrayList<Integer>(Arrays.asList(0)),
                this.testBst.preOrder()
        );
    }

    @Test
    public void testInOrderSingleItem() {
        this.testBst.add(-34);
        this.testBst.add(-34);

        assertEquals("Should be a single item in the array list",
                new ArrayList<Integer>(Arrays.asList(-34)),
                this.testBst.inOrder()
        );
    }

    @Test
    public void testPostOrderSingleItem() {
        this.testBst.add(99);
        this.testBst.add(99);

        assertEquals("Should be a single item in the array list",
                new ArrayList<Integer>(Arrays.asList(99)),
                this.testBst.postOrder()
        );
    }

    @Test
    public void testPreOrderMany() {
        this.testBst.add(-5);
        this.testBst.add(0);
        this.testBst.add(15);
        this.testBst.add(-44);
        this.testBst.add(78);

        assertEquals("Should return the array in the proper order",
                new ArrayList<Integer>(Arrays.asList(-5, -44, 0, 15, 78)),
                this.testBst.preOrder()
        );
    }

    @Test
    public void testInOrderMany() {
        this.testBst.add(-5);
        this.testBst.add(0);
        this.testBst.add(15);
        this.testBst.add(-44);
        this.testBst.add(78);

        assertEquals("Should return the array in the proper order",
                new ArrayList<Integer>(Arrays.asList(-44, -5, 0, 15, 78)),
                this.testBst.inOrder()
        );
    }

    @Test
    public void testPostOrderMany() {
        this.testBst.add(-5);
        this.testBst.add(0);
        this.testBst.add(15);
        this.testBst.add(-44);
        this.testBst.add(78);

        assertEquals("Should return the array in the proper order",
                new ArrayList<Integer>(Arrays.asList(-44, 78, 15, 0, -5)),
                this.testBst.postOrder()
        );
    }
}
