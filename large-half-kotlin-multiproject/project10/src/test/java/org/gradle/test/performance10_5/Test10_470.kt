package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_470 {
    private val production = Production10_470("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}