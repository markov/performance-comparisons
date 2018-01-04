package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_67 {
    private val production = Production6_67("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}