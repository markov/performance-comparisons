package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_457 {
    private val production = Production6_457("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}