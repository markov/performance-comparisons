package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_220 {
    private final Production60_220 production = new Production60_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}