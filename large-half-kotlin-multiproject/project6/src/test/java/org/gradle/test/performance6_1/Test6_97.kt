package org.gradle.test.performance6_1

import org.junit.Assert.*

class Test6_97 {
    private val production = Production6_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}