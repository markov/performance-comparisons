package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_407 {
    private val production = Production6_407("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}