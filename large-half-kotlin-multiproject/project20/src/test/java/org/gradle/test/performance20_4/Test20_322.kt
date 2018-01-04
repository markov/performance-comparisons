package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_322 {
    private val production = Production20_322("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}