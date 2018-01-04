package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_301 {
    private val production = Production41_301("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
