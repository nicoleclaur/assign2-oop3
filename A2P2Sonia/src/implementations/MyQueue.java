package implementations;

import exceptions.EmptyQueueException;
import utilities.QueueADT;

/**
 * A custom queue implementation using a doubly linked list.
 * 
 * @param <E> The type of elements stored in the queue.
 */
public class MyQueue<E> implements QueueADT<E> {

    private MyDLL<E> list;

    /**
     * Constructs an empty queue.
     */
    public MyQueue() {
        list = new MyDLL<>();
    }

    /**
     * Adds the specified element to the end of the queue.
     * 
     * @param toAdd the element to add
     * @throws NullPointerException if the element is null
     */
    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null to the queue.");
        }
        list.add(toAdd);
    }

    /**
     * Removes and returns the element at the front of the queue.
     * 
     * @return the front element
     * @throws EmptyQueueException if the queue is empty
     */
    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty.");
        }
        return list.remove(0);
    }

    /**
     * Returns the element at the front of the queue without removing it.
     * 
     * @return the front element
     * @throws EmptyQueueException if the queue is empty
     */
    @Override
    public E peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty.");
        }
        return list.get(0);
    }

    /**
     * Returns true if the queue is empty.
     * 
     * @return true if the queue has no elements
     */
    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}  