
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masha on 1/11/2018.
 */
public class Point2DTest {
    private Point2D point;
    private Point2D sameRefPoint;
    private Point2D sameStateAsPoint;


    @Before
    public void setUp() throws Exception {
        point = new Point2D(10,5);
        sameRefPoint = point;
        sameStateAsPoint = new Point2D(10,5);
    }

    @Test
    public void getX() throws Exception {
        Assert.assertEquals(new Integer (10), point.getX());
    }

    @Test
    public void getY() throws Exception {
        Assert.assertEquals(new Integer (5), point.getY());
    }

    @Test
    public void moveX() {
        Assert.assertEquals(new Point2D(15,5),point.moveX(5));
    }

    @Test
    public void moveY() {
        Assert.assertEquals(new Point2D(10,10),point.moveY(5));
    }

    @Test
    public void testEquals() throws Exception {
        Point2D yetAnotherPoint = new Point2D(10,5);
        Point2D diffPoint = new Point2D(5,5);
        Point2D nullPoint = null;


        Point2D nullXPoint2D = new Point2D(null, 5);
        Point2D nullXPoint2D2 = new Point2D(null, 10);
        Point2D diffYPoint2D = new Point2D(10, 10);

        Assert.assertTrue(point.equals(point)); // Contract: reflexivity. Code coverage: this == o
        Assert.assertTrue(point.equals(sameRefPoint)); // Contract: trivial condition both reference the same object. Code coverage: this == o
        Assert.assertFalse(point.equals(nullPoint)); // Contract: point is NOT equal to null. Code coverage: TRUE fro o == null
        Assert.assertEquals(point.equals(sameStateAsPoint),sameStateAsPoint.equals(point)); //Contract: symmetry
        Assert.assertEquals(point.equals(sameStateAsPoint)&&
                sameStateAsPoint.equals(yetAnotherPoint),yetAnotherPoint.equals(point)); //transitivity
        Assert.assertFalse(point.equals(diffPoint)); //objects have different state

    }

    @Test
    public void testHashCode() throws Exception {
        Assert.assertTrue( point.hashCode()==sameRefPoint.hashCode()); //same objects have the same hashCode
        Assert.assertTrue(point.hashCode()==sameStateAsPoint.hashCode()); //equal objects have the same hashCode
    }

    @Test
    public void testToString() throws Exception {
        String tempRes = "Point2D{" + "x=" + point.getX() + ", y=" + point.getY() + '}';

        Assert.assertEquals(tempRes, point.toString());

        System.out.println(point);

    }

}