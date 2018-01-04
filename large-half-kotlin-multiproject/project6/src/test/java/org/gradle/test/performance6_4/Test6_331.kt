package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_331 {
    private val production = Production6_331("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}