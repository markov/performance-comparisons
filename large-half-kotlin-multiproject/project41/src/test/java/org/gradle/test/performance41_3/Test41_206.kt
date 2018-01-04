package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_206 {
    private val production = Production41_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
