package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_220 {
    private final Production57_220 production = new Production57_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}