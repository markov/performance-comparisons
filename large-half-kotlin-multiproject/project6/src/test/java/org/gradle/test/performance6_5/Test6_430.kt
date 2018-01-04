package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_430 {
    private val production = Production6_430("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}