package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_414 {
    private val production = Production6_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}