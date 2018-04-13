/**
 * Represents a Circle in our shapes program.
 */
public class Circle extends AbstractShape {
    private Integer radius;

    public Circle(Point2D pin, Integer radius) {
        super(pin);
        this.radius = radius;
    }

    /**
     * Getter for property 'radius'.
     *
     * @return Value for property 'radius'.
     */
    public Integer getRadius() {
        return this.radius;
    }


    @Override
    protected  Shape shapeFactory(Point2D newPin) {
        return new Circle(newPin,this.radius );
    }


    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
