package org.gradle.test.performance6_2

import org.junit.Assert.*

class Test6_147 {
    private val production = Production6_147("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}