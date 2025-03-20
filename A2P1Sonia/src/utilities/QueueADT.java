package utilities;

/**
 * QueueADT.java
 * 
 * @author GabrielSiwa, LulubelleFontelo, MitziEscartin, AlessandraClaur
 * 
 * <p>
 * A queue follows the First-In-First-Out (FIFO) principle, meaning elements
 * are added at the rear and removed from the front. This interface defines
 * the fundamental methods that any queue implementation must support.
 * </p>
 * 
 * @param <E> The type of elements stored in the Queue.
 */

public interface QueueADT<E> {

    /**
     * Adds an element to the end of the queue.
     * <p>
     * <b>Pre-condition:</b> The element must not be null.<br>
     * <b>Post-condition:</b> The element is added to the end of the queue.
     * Returns true if the operation is successful, otherwise false.
     * </p>
     *
     * @param element The element to be added.
     * @return True if the element is successfully added, otherwise false.
     * @throws IllegalArgumentException if the element is null.
     */
    boolean enqueue(E element);
    
    /**
     * Removes and returns the front element of the queue.
     * <p>
     * <b>Pre-condition:</b> The queue must not be empty.<br>
     * <b>Post-condition:</b> The front element is removed from the queue.
     * </p>
     *
     * @return The removed element from the front of the queue.
     * @throws NoSuchElementException If the queue is empty.
     */
    E dequeue();
    
    /**
     * Checks if the queue is full.
     * <p>
     * <b>Pre-condition:</b> The queue must have a fixed capacity.<br>
     * <b>Post-condition:</b> Returns true if the queue has reached its capacity, otherwise false.
     * </p>
     *
     * @return True if the queue is full, otherwise false.
     */
    boolean isFull();
    
    /**
     * Removes all elements from the queue.
     * <p>
     * <b>Pre-condition:</b> None.<br>
     * <b>Post-condition:</b> The queue is emptied, and all elements are removed.
     * </p>
     */
    void dequeueAll();

    /**
     * Compares this queue with another queue to determine equality.
     * <p>
     * <b>Pre-condition:</b> Both queues must be non-null.<br>
     * <b>Post-condition:</b> Returns true if both queues contain identical
     * elements in the same order.
     * </p>
     *
     * @param that The queue to compare with.
     * @return True if the queues are equal, otherwise false.
     */
    
    
    boolean equals(QueueADT<E> that);

    /**
     * Returns an array containing all elements in this queue.
     * The front of the queue corresponds to index 0 of the array.
     * 
     * @return An array containing all elements in this queue.
     */
    Object[] toArray();

    /**
     * Copies all elements into the provided array.
     * <p>
     * <b>Pre-condition:</b> The provided array must be large enough to hold all elements.<br>
     * <b>Post-condition:</b> The array is filled with elements from the queue.
     * </p>
     *
     * @param copy The array to copy elements into.
     * @return The filled array with queue elements.
     */
    E[] toArray(E[] copy);

}
