package org.gradle.test.performance41_2

import org.junit.Assert.*

class Test41_194 {
    private val production = Production41_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
