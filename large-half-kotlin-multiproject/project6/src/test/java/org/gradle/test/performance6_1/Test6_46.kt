package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_46 {
    private val production = Production6_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}