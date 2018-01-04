package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_480 {
    private val production = Production6_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}