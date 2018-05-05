package csc143.listadtv2;


/**
 * Represents an empty list.
 *
 */
 class Empty extends AList {

  public Empty() {}

  @Override

  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Boolean contains(Integer element) {
    return false;
  }

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Integer elementAt(Integer index) {
    throw new IncorrectIndexException("Index out of bounds!");
  }

  @Override
  public List rest() {
      return this;
  }

  @Override
  public Integer first() {
        throw new IllegalOperationException("Called first on empty list.");
    }
  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public String toString() {
    return "Empty{}";
  }
}
