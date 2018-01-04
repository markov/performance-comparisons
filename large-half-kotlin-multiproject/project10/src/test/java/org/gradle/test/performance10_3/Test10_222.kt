package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_222 {
    private val production = Production10_222("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}