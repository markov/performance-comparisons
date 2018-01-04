package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_428 {
    private val production = Production10_428("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}