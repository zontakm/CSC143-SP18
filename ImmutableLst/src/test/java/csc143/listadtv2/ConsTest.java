package csc143.listadtv2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsTest {
    List empty;
    List single;
    List many;


    @Before
    public void setUp() throws Exception {
        empty = new Empty(); // OR: List.createEmpty();
        single = new Cons(1, new Empty()); // OR: List.createEmpty().add(1);
        many = new Cons(1, new Cons (2, new Cons(3, new Empty())));// OR: List.createEmpty().add(3).add(2).add(1);
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(empty.isEmpty());
        Assert.assertFalse(single.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertTrue(single.contains(1));
        Assert.assertTrue(many.contains(2));
        Assert.assertFalse(many.contains(4));
        Assert.assertFalse(empty.contains(1));
    }

    @Test
    public void size() {
        Assert.assertEquals(new Integer(0),empty.size());
        Assert.assertEquals(new Integer(1),single.size());
        Assert.assertEquals(new Integer(3),many.size());
    }

    @Test(expected = IncorrectIndexException.class)
    public void elementAtTestException() {
        empty.elementAt(0);
    }

    @Test(expected = IncorrectIndexException.class)
    public void elementAtTestException2() {
        single.elementAt(1);
    }

    @Test(expected = IncorrectIndexException.class)
    public void elementAtTestException3() {
        many.elementAt(4);
    }

    @Test
    public void rest() {
        Assert.assertEquals(new Empty(),single.rest());
        Assert.assertEquals(new Empty(),empty.rest());
        Assert.assertEquals(List.createEmpty().add(3).add(2),many.rest());
        Assert.assertEquals(List.createEmpty().add(3),many.rest().rest());
    }

    @Test(expected = IllegalOperationException.class)
    public void firstEmpty() {
        empty.first();
    }

    @Test
    public void first() {
        Assert.assertEquals(new Integer(1),single.first());
        Assert.assertEquals(new Integer(2),many.rest().first());
    }

    @Test
    public void getRest() {
        Cons single2 = new Cons(1,empty);
        Assert.assertEquals(new Empty(),single2.getRest());
     }

    @Test
    public void getFirst() {
        Cons single2 = new Cons(1,empty);
        Assert.assertEquals(new Integer(1),single2.getFirst());
    }
}