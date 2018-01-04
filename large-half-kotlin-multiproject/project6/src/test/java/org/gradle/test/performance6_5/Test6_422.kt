package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_422 {
    private val production = Production6_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}