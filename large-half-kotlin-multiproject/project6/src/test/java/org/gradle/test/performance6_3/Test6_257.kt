package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_257 {
    private val production = Production6_257("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}