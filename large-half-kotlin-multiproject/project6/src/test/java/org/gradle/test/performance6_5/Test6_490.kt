package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_490 {
    private val production = Production6_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}