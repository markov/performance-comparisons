package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_221 {
    private val production = Production6_221("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}