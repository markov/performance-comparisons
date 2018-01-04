package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_474 {
    private val production = Production6_474("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}