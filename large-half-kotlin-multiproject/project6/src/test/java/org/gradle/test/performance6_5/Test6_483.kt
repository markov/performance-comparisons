package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_483 {
    private val production = Production6_483("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}