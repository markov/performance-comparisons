package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_27 {
    private final Production71_27 production = new Production71_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}