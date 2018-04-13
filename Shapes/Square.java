/**
 * Created by therapon on 1/18/17.
 */
public class Square extends AbstractShape {

  private Integer side;

  /**
   * Given the side of a rectangle creates the rectangle
   *
   * @param pin the rectangle's pin location
   * @param side length of the rectangle's side
   */
  public Square(Point2D pin, Integer side) {
    super(pin);
    this.side = side;
  }

  @Override
  protected Shape shapeFactory(Point2D newPin) {
    return new Square(newPin, this.side);
  }

  /**
   * Getter for property 'side'.
   *
   * @return Value for property 'side'.
   */
  public Integer getSide() {
    return side;
  }

  @Override
  public Double area() {
    return 1.0* side * side;
  }

}
