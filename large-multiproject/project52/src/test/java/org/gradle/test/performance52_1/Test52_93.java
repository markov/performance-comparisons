package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_93 {
    private final Production52_93 production = new Production52_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}