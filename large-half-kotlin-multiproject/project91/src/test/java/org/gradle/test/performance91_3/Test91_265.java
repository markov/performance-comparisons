package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_265 {
    private final Production91_265 production = new Production91_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}