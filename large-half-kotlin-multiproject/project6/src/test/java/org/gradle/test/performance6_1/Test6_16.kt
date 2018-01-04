package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_16 {
    private val production = Production6_16("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}