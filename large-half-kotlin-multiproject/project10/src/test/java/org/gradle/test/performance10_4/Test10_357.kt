package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_357 {
    private val production = Production10_357("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}