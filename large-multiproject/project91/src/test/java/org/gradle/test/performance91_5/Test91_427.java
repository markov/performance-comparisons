package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_427 {
    private final Production91_427 production = new Production91_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}