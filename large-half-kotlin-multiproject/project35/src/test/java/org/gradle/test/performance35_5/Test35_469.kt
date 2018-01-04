package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_469 {
    private val production = Production35_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}