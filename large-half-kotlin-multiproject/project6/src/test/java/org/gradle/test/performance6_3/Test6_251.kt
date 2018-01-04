package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_251 {
    private val production = Production6_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}