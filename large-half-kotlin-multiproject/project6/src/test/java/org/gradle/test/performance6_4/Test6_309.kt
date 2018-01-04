package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_309 {
    private val production = Production6_309("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}