package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_472 {
    private final Production33_472 production = new Production33_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}