package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Test to find the answer to the SantaInAnElevator challenge
 * @author Sebastian Greenholtz
 */
public class SantaInAnElevatorTest {

    private static SantaInAnElevator main;
    private static String floorMap;

    @BeforeClass
    public static void init() {
        main = new SantaInAnElevator();
        floorMap = main.readFileIntoString("src/main/resources/SantaUpDown.txt");

    }

    @Test
    public void readFileIntoStringTest() {
        assertNotNull(floorMap);
    }

    @Test
    public void verifyFloorMapResult()
    {
        assertTrue(floorMap.contains(")"));
        assertTrue(floorMap.contains("("));
        assertFalse(floorMap.contains("abc"));
    }

    @Test
    public void findFloorAllClosedTest() {
        String parens = ")))";
        Integer expected = -3;
        Integer result = main.findFloor(parens);
        assertEquals(expected, result);
    }

    @Test
    public void findFloorAllOpenTest() {
        String parens = "(((((";
        Integer expected = 5;
        Integer result = main.findFloor(parens);
        assertEquals(expected, result);
    }

    @Test
    public void findFloorMixTest() {
        String parens = "((((())(((";
        Integer expected = 6;
        Integer result = main.findFloor(parens);
        assertEquals(expected, result);
    }

    @Test
    public void findFloorResult() {
        Integer result = main.findFloor(floorMap);
        Integer expected = 138;
        assertEquals(expected, result);
    }

}