package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_256 {
    private val production = Production10_256("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}