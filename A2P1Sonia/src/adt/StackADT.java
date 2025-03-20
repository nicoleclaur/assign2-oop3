package adt;




public interface StackADT<E> {

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
     * Removes and returns the element at the top of the stack.
     * <p>
     * <b>Pre-condition:</b> The stack must not be empty.<br>
     * <b>Post-condition:</b> The top element is removed from the stack.
     * If the stack is empty, it throws an EmptyStackException.
     * </p>
     *
     * @return The element at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    E pop();

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
     * Searches for an element in the stack and returns its index.
     * <p>
     * <b>Pre-condition:</b> The element must not be null.<br>
     * <b>Post-condition:</b> Returns the index of the element if found, or -1 if not found.
     * </p>
     *
     * @param obj The element to search for.
     * @return The index of the element in the stack if found, otherwise -1.
     * @throws IllegalArgumentException if the element is null.
     */
    int search(E obj);

    /**
     * Checks whether the stack contains the specified element.
     * <p>
     * <b>Pre-condition:</b> The element must not be null.<br>
     * <b>Post-condition:</b> Returns true if the element is found in the stack, otherwise false.
     * </p>
     *
     * @param obj The element to check for.
     * @return True if the element is found, otherwise false.
     * @throws IllegalArgumentException if the element is null.
     */
    boolean contains(E obj);

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
