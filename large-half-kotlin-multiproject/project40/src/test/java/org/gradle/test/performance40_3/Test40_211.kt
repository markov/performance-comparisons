package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_211 {
    private val production = Production40_211("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}