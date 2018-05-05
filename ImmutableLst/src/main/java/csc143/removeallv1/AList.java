package csc143.removeallv1;

/**
 * Represents an abstract list.
 *
 */
 abstract class AList implements List {

  public List add(Integer element) {
    return new Cons(element, this);
  }
}
