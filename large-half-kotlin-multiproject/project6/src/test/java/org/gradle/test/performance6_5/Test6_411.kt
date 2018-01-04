package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_411 {
    private val production = Production6_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}