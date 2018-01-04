package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_311 {
    private val production = Production6_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}