package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_227 {
    private final Production60_227 production = new Production60_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}