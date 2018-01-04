package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_62 {
    private val production = Production6_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}