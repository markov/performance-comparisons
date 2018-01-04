package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_451 {
    private val production = Production10_451("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}