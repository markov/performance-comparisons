package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_173 {
    private val production = Production6_173("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}