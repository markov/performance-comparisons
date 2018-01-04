package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_15 {
    private val production = Production6_15("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}