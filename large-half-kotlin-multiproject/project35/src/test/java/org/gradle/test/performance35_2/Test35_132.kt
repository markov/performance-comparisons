package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_132 {
    private val production = Production35_132("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}