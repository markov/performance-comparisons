package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_303 {
    private final Production64_303 production = new Production64_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}