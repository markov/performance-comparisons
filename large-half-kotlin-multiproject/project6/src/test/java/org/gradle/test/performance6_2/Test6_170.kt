package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_170 {
    private val production = Production6_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}