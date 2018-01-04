package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_339 {
    private val production = Production41_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
