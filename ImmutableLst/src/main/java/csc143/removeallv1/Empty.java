package csc143.removeallv1;

/**
 * Represents an empty list.
 *
 */
 class Empty extends AList {

  public Empty() {}

  public Boolean isEmpty() {
    return true;
  }

  public Boolean contains(Integer element) {
    return false;
  }

  public Integer size() {
    return 0;
  }

  public Integer elementAt(Integer index) throws IncorrectIndexException {
    throw new IncorrectIndexException("Index out of bounds!");
  }

  public List rest() {
    return this;
  }

  @Override
  public List removeAll(List toBeremoved) {
    return this;
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
