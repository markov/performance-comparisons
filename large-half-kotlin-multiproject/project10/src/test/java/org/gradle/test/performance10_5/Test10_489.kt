package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_489 {
    private val production = Production10_489("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}