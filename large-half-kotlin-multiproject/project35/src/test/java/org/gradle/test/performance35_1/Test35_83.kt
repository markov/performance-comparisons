package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_83 {
    private val production = Production35_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}