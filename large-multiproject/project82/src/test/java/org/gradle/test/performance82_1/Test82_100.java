package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_100 {
    private final Production82_100 production = new Production82_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}