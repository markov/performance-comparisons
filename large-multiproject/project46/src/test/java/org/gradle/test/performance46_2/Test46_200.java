package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_200 {
    private final Production46_200 production = new Production46_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}