package csc143.removeallv1;

import javax.management.RuntimeMBeanException;

/**
 * Represents a situation where the index provided for a given list is out of bounds.
 */
public class IncorrectIndexException extends RuntimeException {

  public IncorrectIndexException(String message) {
    super(message);
  }
}
