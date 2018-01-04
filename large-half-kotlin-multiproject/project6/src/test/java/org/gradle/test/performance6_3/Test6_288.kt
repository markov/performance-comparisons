package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_288 {
    private val production = Production6_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}