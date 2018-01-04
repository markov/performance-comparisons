package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_443 {
    private val production = Production10_443("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}