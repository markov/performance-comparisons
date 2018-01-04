package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_98 {
    private val production = Production6_98("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}