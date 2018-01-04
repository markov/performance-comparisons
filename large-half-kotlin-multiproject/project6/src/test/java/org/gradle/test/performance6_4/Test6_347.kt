package org.gradle.test.performance6_4

import org.junit.Assert.*

class Test6_347 {
    private val production = Production6_347("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}