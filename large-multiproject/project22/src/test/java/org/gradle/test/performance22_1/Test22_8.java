package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_8 {
    private final Production22_8 production = new Production22_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}