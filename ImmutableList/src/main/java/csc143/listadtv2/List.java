package csc143.listadtv2;

/**
 * Represents a List of Integers.
 */
public interface List {


  /**
   * Creates a new empty list.
   *
   * @return new empty list
   */
  public static List createEmpty() {     // <1>
    return new Empty();                  // <2>
  }

  /**
   * Check if the list is empty.
   *
   * @return true if list is empty, false otherwise
   */
  Boolean isEmpty();

  /**
   * Prepend {@code element} to this list.
   *
   * @param element new element to be added
   * @return same list with element prepended
   */
  List add(Integer element);

  /**
   * Check if {@code element} is in the list.
   *
   * @param element the element we are looking for
   * @return true if element is in the list, false otherwise
   */
  Boolean contains(Integer element);

  /**
   * The number of elements in this list.
   *
   * @return number of elements in this list
   */
  Integer size();

  /**
   * Retrieve the element at {@code index}. Index should be greater or equal to 1
   * and less than or equal to the list's size.
   *
   * @param index position in the list
   * @return element at position index
   * @throws IncorrectIndexException  when index is less than 1 or greater than size()
   */
  Integer elementAt(Integer index);

  /**
   * Return the tail of this list; all elements except the first one.
   *
   * @return the same list without the first element
   * @throws IllegalOperationException when called on an empty list
   *
   */
  List rest();


  /**
   * Return the first element of the list.
   *
   * @return the first element
   * @throws IllegalOperationException when called on an empty list
   */
  Integer first();

}
