package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_24 {
    private val production = Production6_24("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}