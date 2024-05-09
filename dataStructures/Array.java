package dataStructures;

/**
 * This interface represents an array data structure that stores elements of type E.
 * @param <E> the type of elements stored in the array
 */
public interface Array<E> {

    /**
     * Inserts an element at the last position of the array.
     * @param e the element to insert
     */
    void insertLast(E e);

    /**
     * Inserts an element at the specified position in the array.
     *
     * @param e   the element to insert
     * @param pos the position at which to insert the element
     * @pre pos < size()
     */
    void insertAt(E e, int pos);

    /**
     * Removes the last element from the array.
     * @pre size() > 0
     */
    void removeLast();

    /**
     * Removes the element at the specified position from the array.
     * @param pos the position of the element to remove
     * @pre pos < size()
     */
    void removeAt(int pos);

    /**
     * Searches for the specified element in the array in forward direction.
     *
     * @param e the element to search for
     * @return true if the element is found, false otherwise
     */
    boolean searchForward(E e);

    /**
     * Searches for the specified element in the array in backward direction.
     * @param e the element to search for
     * @return <code>true</code> if the element is found, <code>false</code> otherwise
     */
    boolean searchBackward(E e);

    /**
     * Searches for the positions of the specified element in the array.
     * @param e the element to search for
     * @return the index of the element if found, <code>-1</code> otherwise
     */
    int searchIndexOf(E e);

    /**
     * Retrieves the element at the specified position in the array.
     * @param pos the position of the element to retrieve
     * @return the element at position <code>pos</code>
     * @pre pos < size()
     */
    E get(int pos);

    /**
     * Returns the number of elements in the array.
     * @return the number of elements in the array
     */
    int size();

    /**
     * Returns an iterator over the elements in the array.
     * @return an iterator
     */
    Iterator<E> iterator();
}