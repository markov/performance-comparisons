package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_7 {
    private val production = Production6_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}