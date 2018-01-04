package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_436 {
    private val production = Production6_436("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}