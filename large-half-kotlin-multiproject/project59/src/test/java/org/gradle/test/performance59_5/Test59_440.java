package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_440 {
    private final Production59_440 production = new Production59_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}