package org.gradle.test.performance41_5

import org.junit.Assert.*

class Test41_408 {
    private val production = Production41_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
