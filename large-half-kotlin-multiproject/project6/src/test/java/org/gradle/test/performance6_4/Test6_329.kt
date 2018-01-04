package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_329 {
    private val production = Production6_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}