package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the Interface List<E>:
 * 1.1 void add(int index, E e)
 * 1.2 void remove(int index)
 * 1.3 void get(int index)
 *
 * Add at least one test for an exception.
 */
public class ListTest {

    private List<String> myList;

    @Before
    public void setup() {
        myList = new ArrayList<String>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
    }

    @Test
    public void testAddSuccess() {
        String elementToInsert = "Item 4";

        myList.add(elementToInsert);
        assertEquals("List size is incorrect", 4, myList.size());
        assertTrue("List missing inserted element", myList.contains(elementToInsert));
    }

    @Test
    public void testRemove() {
        int indexToRemove = 0;
        String itemToRemove = "Item 1";
        myList.remove(indexToRemove);
        assertEquals("List size is incorrect", 2, myList.size());
        assertFalse("Item not removed", myList.contains(itemToRemove));
    }

    @Test
    public void testGet() {
        String itemToGet = "Item 2";
        int index = 1;
        String result = myList.get(index);
        assertEquals("Item not retrieved successfully", itemToGet, result);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBounds() {
        int index = 5;
        myList.get(index);
    }


}