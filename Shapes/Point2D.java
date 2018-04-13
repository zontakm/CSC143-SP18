/**
 * Repersents a cartesian coordinate.
 *
 */
public class Point2D {

    private Integer x;
    private Integer y;

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for property 'x'.
     *
     * @return Value for property 'x'.
     */
    public Integer getX() {
        return this.x;
    }

    /**
     * Getter for property 'y'.
     *
     * @return Value for property 'y'.
     */
    public Integer getY() {
        return this.y;
    }

    /**
     * create a new point translated by dx in x direction
     * @param dx - delta in x -direction
     * @return new Point
     */

    public Point2D translateX(Integer dx) {
        return new Point2D(this.x + dx, this.y);
    }


    @Override
    public String toString() {
        return "Point2D{"
            + "x=" + x
            + ", y=" + y
            + '}';
    }


}

