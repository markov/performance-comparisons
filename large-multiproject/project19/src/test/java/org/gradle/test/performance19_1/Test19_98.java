package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_98 {
    private final Production19_98 production = new Production19_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}