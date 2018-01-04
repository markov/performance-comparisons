package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_239 {
    private val production = Production6_239("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}