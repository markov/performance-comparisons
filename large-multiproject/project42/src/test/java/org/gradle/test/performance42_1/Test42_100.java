package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_100 {
    private final Production42_100 production = new Production42_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}