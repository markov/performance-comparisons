package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_250 {
    private val production = Production6_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}