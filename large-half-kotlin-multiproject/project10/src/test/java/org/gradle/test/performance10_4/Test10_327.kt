package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_327 {
    private val production = Production10_327("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}