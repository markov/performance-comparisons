package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_127 {
    private val production = Production35_127("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}