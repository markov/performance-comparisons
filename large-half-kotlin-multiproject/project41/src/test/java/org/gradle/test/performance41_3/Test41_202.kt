package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_202 {
    private val production = Production41_202("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
