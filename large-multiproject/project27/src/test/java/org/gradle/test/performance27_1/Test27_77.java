package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_77 {
    private final Production27_77 production = new Production27_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}