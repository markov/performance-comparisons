package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_487 {
    private final Production78_487 production = new Production78_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}