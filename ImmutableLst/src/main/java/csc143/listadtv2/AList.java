package csc143.listadtv2;

/**
 * Represents an abstract list.
 *
 */
 abstract class AList implements List {
 @Override
 public List add(Integer element) { return new Cons(element, this);
  }
}
