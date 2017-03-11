package test;

import Complementary.Complementary;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by pavlo on 11.03.17.
 */
public class testComplementary {

    @Test
    public void testIsComplimentary() {
        int[] arr = {1, 2, 3, 4, -1};
        assertTrue(Complementary.isComplementary(arr, 0));
    }

    @Test(expected = NullPointerException.class)
    public void testIsComplimentaryException() {
        int[] arr = null;
        assertTrue(Complementary.isComplementary(arr, 0));

    }

    @Test
    public void testIsNotComplimentary() {
        int[] arr = {1, 2, 3, 4, -1};
        assertFalse(Complementary.isComplementary(arr, 8));
    }


}
