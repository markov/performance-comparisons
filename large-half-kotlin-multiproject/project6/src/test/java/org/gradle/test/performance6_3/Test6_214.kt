package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_214 {
    private val production = Production6_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}