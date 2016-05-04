package ua.kpi.tef.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis Drabchuck on 04.05.2016.
 */
public class ModelTest {

    Model m;

    @Before
    public void before() {
        m = new Model();
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals("Factorial calculations is wrong!",
                1L, m.calculateFactorial(0));
        assertEquals("Factorial calculations is wrong!",
                1L, m.calculateFactorial(1));
        assertEquals("Factorial calculations is wrong!",
                2L, m.calculateFactorial(2));
        assertEquals("Factorial calculations is wrong!",
                6L, m.calculateFactorial(3));
        assertEquals("Factorial calculations is wrong!",
                120L, m.calculateFactorial(5));
        assertEquals("Factorial calculations is wrong!",
                2432902008176640000L, m.calculateFactorial(20));

    }

}
