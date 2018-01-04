package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_194 {
    private val production = Production6_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}