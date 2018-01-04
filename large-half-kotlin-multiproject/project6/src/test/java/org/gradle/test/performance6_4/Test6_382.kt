package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_382 {
    private val production = Production6_382("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}