package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_119 {
    private final Production51_119 production = new Production51_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}