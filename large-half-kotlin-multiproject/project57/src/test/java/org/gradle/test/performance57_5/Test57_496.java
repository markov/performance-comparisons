package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_496 {
    private final Production57_496 production = new Production57_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}