package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_343 {
    private val production = Production35_343("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}