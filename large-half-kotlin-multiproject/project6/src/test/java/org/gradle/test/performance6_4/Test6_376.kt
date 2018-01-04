package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_376 {
    private val production = Production6_376("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}