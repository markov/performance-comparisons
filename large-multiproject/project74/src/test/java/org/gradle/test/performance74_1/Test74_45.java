package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_45 {
    private final Production74_45 production = new Production74_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}