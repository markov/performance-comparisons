package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_117 {
    private val production = Production35_117("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}