/**
 * Represents a rectangle in our shapes program.
 */
public class Rectangle extends AbstractShape {

    private Integer width;
    private Integer height;

    public Rectangle(Point2D pin, Integer width, Integer height) {
        super(pin);
        this.width = width;
        this.height = height;
    }

    /**
     * Getter for property 'width'.
     *
     * @return Value for property 'width'.
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * Getter for property 'height'.
     *
     * @return Value for property 'height'.
     */
    public Integer getHeight() {
        return this.height;
    }


    @Override
    protected Shape shapeFactory(Point2D newPin) {
        return new Rectangle(newPin, this.width, this.height);
    }

    @Override
    public Double area() {
        return 1.0* height * width;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
