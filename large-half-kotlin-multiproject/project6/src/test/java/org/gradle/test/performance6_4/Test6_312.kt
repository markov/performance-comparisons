package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_312 {
    private val production = Production6_312("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}