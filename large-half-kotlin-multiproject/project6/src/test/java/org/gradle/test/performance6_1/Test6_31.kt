package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_31 {
    private val production = Production6_31("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}