package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_409 {
    private val production = Production6_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}