package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_406 {
    private final Production93_406 production = new Production93_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}