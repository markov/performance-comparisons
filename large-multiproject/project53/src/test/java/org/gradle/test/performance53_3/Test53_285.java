package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_285 {
    private final Production53_285 production = new Production53_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}