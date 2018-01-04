package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_411 {
    private val production = Production10_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}