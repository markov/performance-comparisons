package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_331 {
    private final Production99_331 production = new Production99_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}