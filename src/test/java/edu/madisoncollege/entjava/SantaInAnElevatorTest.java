package edu.madisoncollege.entjava;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Test to find the answer to the SantaInAnElevator challenge
 * @author Sebastian Greenholtz
 */
public class SantaInAnElevatorTest {

    @Test(expected = FileNotFoundException.class)
    public void readFileIntoString() throws Exception {
        SantaInAnElevator main = new SantaInAnElevator();
        main.readFileIntoString("resources/test.txt");
    }

}