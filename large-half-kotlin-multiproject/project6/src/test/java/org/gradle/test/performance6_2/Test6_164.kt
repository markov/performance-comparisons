package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_164 {
    private val production = Production6_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}