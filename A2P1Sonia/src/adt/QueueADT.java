package adt;

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
