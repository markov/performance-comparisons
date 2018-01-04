package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_487 {
    private val production = Production20_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}