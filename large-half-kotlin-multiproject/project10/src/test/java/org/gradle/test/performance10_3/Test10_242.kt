package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_242 {
    private val production = Production10_242("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}