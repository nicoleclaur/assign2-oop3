package tests;
import implementations.MyStack;
import java.util.NoSuchElementException;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
    private MyStack<String> stack;

    @Before
    public void setUp() {
        stack = new MyStack<>();
    }

    @Test
    public void testIsEmptyInitially() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAddsElement() {
        stack.push("A");
        assertFalse(stack.isEmpty());
        assertEquals("A", stack.peek());
    }

    @Test(expected = NullPointerException.class)
    public void testPushNullThrowsException() {
        stack.push(null);
    }

    @Test
    public void testPopReturnsLastPushed() {
        stack.push("A");
        stack.push("B");
        String value = stack.pop();
        assertEquals("B", value);
        assertEquals("A", stack.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPopOnEmptyStackThrowsException() {
        MyStack<String> stack = new MyStack<>();
        stack.pop();
    }

    @Test(expected = NoSuchElementException.class)
    public void testPeekOnEmptyStackThrowsException() {
        stack.peek();
    }

    
    //Uncomment this when Clear has been implemented
//    @Test
//    public void testClearEmptiesStack() {
//        stack.push("A");
//        stack.push("B");
//        stack.clear();
//        assertTrue(stack.isEmpty());
//    }

    //Uncomment this when search is implemented
//    @Test
//    public void testSearchReturnsCorrectPosition() {
//        stack.push("A"); // bottom
//        stack.push("B");
//        stack.push("C"); // top
//        assertEquals(1, stack.search("C"));
//        assertEquals(2, stack.search("B"));
//        assertEquals(3, stack.search("A"));
//    }

    //uncomment when equals and search have been implemented
//    @Test
//    public void testSearchReturnsNegativeIfNotFound() {
//        stack.push("A");
//        assertEquals(-1, stack.search("Z"));
//    }

//Uncomment when equals is implemented

//    @Test
//    public void testSizeIncreasesWithPush() {
//        stack.push("1");
//        stack.push("2");
//        assertEquals(2, stack.size());
//    }

    //Uncomment this block when myStack.equal has been implementetd
//    @Test
//    public void testEqualsTrueWhenSameContent() {
//        MyStack<String> anotherStack = new MyStack<>();
//        stack.push("A");
//        stack.push("B");
//        anotherStack.push("A");
//        anotherStack.push("B");
//
//        assertTrue(stack.equals(anotherStack));
//    }

    @Test
    public void testEqualsFalseWhenDifferentContent() {
        MyStack<String> anotherStack = new MyStack<>();
        stack.push("A");
        anotherStack.push("B");

        assertFalse(stack.equals(anotherStack));
    }
}