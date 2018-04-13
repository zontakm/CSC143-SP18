/**
 * Represents the common properties of a shape
 */
public abstract class AbstractShape implements Shape {
    protected Point2D pin;

    public AbstractShape(Point2D pin) {
        this.pin = pin;
    }

    /**
     * Getter for property 'pin'.
     *
     * @return Value for property 'pin'.
     */
    public Point2D getPin() {
        return this.pin;
    }

    /**
     * method returns appropriate shape based on Dynamic Dispatch
     * @param newPin - new pin to create  a new shape
     * @return shape with new pin and other attributes unchanged
     */
    protected abstract Shape shapeFactory(Point2D newPin);

    @Override
    public Shape moveX (Integer dx){
        return this.shapeFactory(pin.translateX(dx));
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "pin=" + pin +
                '}';
    }

}
