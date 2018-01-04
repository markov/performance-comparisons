package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_453 {
    private val production = Production6_453("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}