package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_356 {
    private final Production59_356 production = new Production59_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}