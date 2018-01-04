package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_63 {
    private val production = Production35_63("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}