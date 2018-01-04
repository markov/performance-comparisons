package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_122 {
    private val production = Production6_122("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}