package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_44 {
    private final Production53_44 production = new Production53_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}