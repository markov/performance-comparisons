package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_337 {
    private val production = Production35_337("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}