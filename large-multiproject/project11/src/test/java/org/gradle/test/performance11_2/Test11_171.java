package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_171 {
    private final Production11_171 production = new Production11_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}