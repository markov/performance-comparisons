package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_194 {
    private val production = Production20_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}