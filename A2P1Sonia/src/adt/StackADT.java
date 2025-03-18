package adt;

public interface StackADT<E>
{
	/**
     * Adds an element to the top of the stack.
     * <p>
     * <b>Pre-condition:</b> The element must not be null.<br>
     * <b>Post-condition:</b> The element is added to the top of the stack.
     * Returns true if the operation is successful, otherwise false.
     * </p>
     *
     * @param element The element to be added.
     * @return True if the element is successfully added, otherwise false.
     * @throws IllegalArgumentException if the element is null.
     */
    boolean push(E element);

    /**
     * Compares this stack with another stack to determine equality.
     * <p>
     * <b>Pre-condition:</b> Both stacks must be non-null.<br>
     * <b>Post-condition:</b> Returns true if both stacks contain identical
     * elements in the same order.
     * </p>
     *
     * @param that The stack to compare with.
     * @return True if the stacks are equal, otherwise false.
     */
    boolean equals(StackADT<E> that);

    /**
     * Returns an array containing all elements in this stack.
     * The top of the stack corresponds to index 0 of the array.
     *
     * @return An array containing all elements in this stack.
     */
    Object[] toArray();

    /**
     * Copies all elements into the provided array.
     * <p>
     * <b>Pre-condition:</b> The provided array must be large enough to hold all elements.<br>
     * <b>Post-condition:</b> The array is filled with elements from the stack.
     * </p>
     *
     * @param copy The array to copy elements into.
     * @return The filled array with stack elements.
     */
    E[] toArray(E[] copy);
	
}
