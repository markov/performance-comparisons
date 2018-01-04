package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_35 {
    private val production = Production6_35("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}