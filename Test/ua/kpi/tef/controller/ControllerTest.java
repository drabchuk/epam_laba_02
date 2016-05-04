package ua.kpi.tef.controller;

import org.junit.Before;
import org.junit.Test;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

import static org.junit.Assert.*;

/**
 * Created by Denis Drabchuck on 04.05.2016.
 */
public class ControllerTest {

    Controller c;

    @Before
    public void before() {
        c = new Controller(new Model(), new View());
    }

    @Test
    public void testIsInRange() {
       assertTrue("Must be in range", c.isInRange(0, 0, 20));
       assertTrue("Must be in range", c.isInRange(20, 0, 20));
       assertTrue("Must be in range", c.isInRange(10, 0, 20));
       assertFalse("Must not be in range", c.isInRange(50, 0, 20));
       assertFalse("Must not be in range", c.isInRange(-1, 0, 20));
       assertFalse("Must not be in range", c.isInRange(21, 0, 20));
       assertFalse("Must not be in range", c.isInRange(299, 0, 20));
       assertFalse("Must not be in range", c.isInRange(-19, 0, 20));
       assertFalse("Must not be in range", c.isInRange(-199, 0, 20));
    }

}
