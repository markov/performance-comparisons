package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_385 {
    private val production = Production16_385("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}