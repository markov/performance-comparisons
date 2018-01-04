package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_284 {
    private val production = Production41_284("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
