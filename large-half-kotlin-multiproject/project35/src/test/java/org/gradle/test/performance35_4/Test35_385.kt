package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_385 {
    private val production = Production35_385("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}