package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_383 {
    private val production = Production6_383("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}