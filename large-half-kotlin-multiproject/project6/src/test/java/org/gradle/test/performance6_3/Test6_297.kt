package org.gradle.test.performance6_3

import org.junit.Assert.*

class Test6_297 {
    private val production = Production6_297("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}