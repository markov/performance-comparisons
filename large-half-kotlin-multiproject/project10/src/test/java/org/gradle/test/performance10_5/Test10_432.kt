package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_432 {
    private val production = Production10_432("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}