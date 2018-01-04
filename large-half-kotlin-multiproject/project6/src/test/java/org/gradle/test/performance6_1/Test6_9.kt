package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_9 {
    private val production = Production6_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}