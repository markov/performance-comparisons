package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_296 {
    private final Production93_296 production = new Production93_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}