package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21174 {
    private final Productionnull_21174 production = new Productionnull_21174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}