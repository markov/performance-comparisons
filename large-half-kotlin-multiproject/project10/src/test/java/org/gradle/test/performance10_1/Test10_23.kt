package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_23 {
    private val production = Production10_23("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}