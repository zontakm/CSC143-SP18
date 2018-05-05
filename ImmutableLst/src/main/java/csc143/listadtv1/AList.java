package csc143.listadtv1;

/**
 * Represents an abstract list.
 *
 */
public abstract class AList implements List {

  public List add(Integer element) {

    return new Cons(element, this);
  }
}
