package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_358 {
    private val production = Production6_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}