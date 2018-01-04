package org.gradle.test.performance35_3

import org.junit.Assert.*

class Test35_231 {
    private val production = Production35_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}