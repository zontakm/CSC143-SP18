package csc143.listadtv2;

import java.util.Objects;

/**
 * Represents a list of at least one element.
 */
 class Cons extends AList {

  private Integer first;
  private List rest;

  public Cons(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Boolean contains(Integer element) {
    if (getFirst().equals(element)) {
      return true;
    } else {
      return getRest().contains(element);
    }
  }

  @Override
  public Integer size() {
    return 1 + getRest().size();
  }

  @Override
  public Integer elementAt(Integer index)  {
   if (index < 0 || index >= size()) {
      throw new IncorrectIndexException("Index out of bounds.");
    }

    if (index.equals(0)) {
      return getFirst();
    } else {
      return getRest().elementAt(index - 1);
    }
  }
  @Override
  public List rest() {
        return this.getRest();
    }

  @Override
  public Integer first() {
        return this.getFirst();
    }


    /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return rest;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return first;
  }


  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    Cons cons = (Cons) other;
    return Objects.equals(first, cons.first)
        && Objects.equals(rest, cons.rest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, rest);
  }

  @Override
  public String toString() {
    return "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
  }

}
