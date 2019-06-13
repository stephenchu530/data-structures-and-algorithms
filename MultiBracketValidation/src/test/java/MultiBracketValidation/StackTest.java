package MultiBracketValidation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    public Stack<Character> testStack;

    @Before
    public void setUpStack() {
        this.testStack = new Stack<>();
    }

    @After
    public void tearDownStack() {
        this.testStack = null;
    }

    @Test
    public void testInstantiate() {
        Stack<Integer> testStack1 = new Stack<>();
        Stack<String> testStack2 = new Stack<>();
        Stack<Character> testStack3 = new Stack<>();
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekEmpty() {
        this.testStack.peek();
    }

    @Test(expected = IllegalStateException.class)
    public void testPopEmpty() {
        this.testStack.pop();
    }

    @Test
    public void testPushOnce() {
        this.testStack.push('g');
    }

    @Test
    public void testPushPopOnce() {
        this.testStack.push('j');
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('j')
        );
    }

    @Test
    public void testMultiPushPop() {
        this.testStack.push('t');
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('t')
        );
        this.testStack.push('r');
        this.testStack.push('h');
        this.testStack.push('u');
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('u')
        );
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('h')
        );
        this.testStack.push('y');
        this.testStack.push('z');
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('z')
        );
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('y')
        );
        assertTrue("Should return the proper value",
                this.testStack.pop().equals('r')
        );
    }
}