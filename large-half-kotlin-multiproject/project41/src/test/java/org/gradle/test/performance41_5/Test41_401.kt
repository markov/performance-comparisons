package org.gradle.test.performance41_5

import org.junit.Assert.*

class Test41_401 {
    private val production = Production41_401("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
