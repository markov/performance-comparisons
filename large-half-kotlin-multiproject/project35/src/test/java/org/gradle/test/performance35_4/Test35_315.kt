package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_315 {
    private val production = Production35_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}