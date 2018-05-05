package csc143.listadtv2;

/**
 * Represents a situation where the index provided for a given list is out of bounds.
 */
public class IncorrectIndexException extends RuntimeException {

  public IncorrectIndexException(String message) {
    super(message);
  }
}
