package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_39 {
    private val production = Production6_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}