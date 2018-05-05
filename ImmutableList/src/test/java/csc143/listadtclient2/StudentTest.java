package csc143.listadtclient2;

import csc143.listadtv2.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student anyStudent;
    private List studentGrades;

    @Before
    public void setUp() throws Exception {
        studentGrades = List.createEmpty().add(65).add(95).add(100);
        anyStudent = new Student(111,studentGrades);
    }

    @Test
    public void printGrades(){
        //NOT a test!!!
        List traverseGrades = anyStudent.getGrades();
        while (!traverseGrades.isEmpty()) {
            System.out.println(traverseGrades.first());
            traverseGrades = traverseGrades.rest();
        }
    }
}