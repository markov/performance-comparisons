package org.gradle.test.performance6_5

import org.junit.Assert.*

class Test6_434 {
    private val production = Production6_434("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}