package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_340 {
    private val production = Production35_340("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}