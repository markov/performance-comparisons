package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_253 {
    private val production = Production41_253("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
