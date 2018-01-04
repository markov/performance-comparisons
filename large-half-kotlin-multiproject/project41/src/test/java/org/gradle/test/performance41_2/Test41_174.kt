package org.gradle.test.performance41_2

import org.junit.Assert.*

class Test41_174 {
    private val production = Production41_174("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
