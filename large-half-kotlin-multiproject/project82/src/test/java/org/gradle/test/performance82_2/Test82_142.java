package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_142 {
    private final Production82_142 production = new Production82_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}