package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_475 {
    private final Production85_475 production = new Production85_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}