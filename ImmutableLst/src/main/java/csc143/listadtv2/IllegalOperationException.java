package csc143.listadtv2;

/**
 * Represents an illegal operation on a List.
 */
public class IllegalOperationException extends RuntimeException{
  public IllegalOperationException(String msg) {
    super(msg);
  }
}
