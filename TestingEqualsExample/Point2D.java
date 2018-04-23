

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
     * move x by delta
     * @param dx  - delta
     * @return - new posn
     */
    public Point2D moveX(Integer dx){
        return new Point2D(x + dx, y);

    }

    /**
     * move y by delta
     * @param dy  - delta
     * @return - new posn
     */
    public Point2D moveY(Integer dy){
        return new Point2D(x , y + dy);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point2D posn = (Point2D) o;

        if (this.getX() != null ? !getX().equals(posn.getX()) : posn.getX() != null) return false;
        return getY() != null ? getY().equals(posn.getY()) : posn.getY() == null;
    }

    @Override
    public int hashCode() {
        int result = getX() != null ? getX().hashCode() : 0;
        result = 31 * result + (getY() != null ? getY().hashCode() : 0);
        return result;
    }
   @Override
    public String toString() {
        return "Posn{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}

