package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_11 {
    private val production = Production10_11("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}