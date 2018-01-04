package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_6 {
    private val production = Production6_6("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}