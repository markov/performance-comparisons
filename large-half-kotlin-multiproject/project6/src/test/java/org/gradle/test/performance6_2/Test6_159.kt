package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_159 {
    private val production = Production6_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}