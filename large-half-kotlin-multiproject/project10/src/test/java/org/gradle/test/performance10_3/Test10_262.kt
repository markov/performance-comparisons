package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_262 {
    private val production = Production10_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}