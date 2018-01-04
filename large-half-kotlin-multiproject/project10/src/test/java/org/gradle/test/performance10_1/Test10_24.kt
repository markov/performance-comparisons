package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_24 {
    private val production = Production10_24("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}