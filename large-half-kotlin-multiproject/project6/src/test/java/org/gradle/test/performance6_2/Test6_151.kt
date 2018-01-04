package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_151 {
    private val production = Production6_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}