package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_312 {
    private val production = Production10_312("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}