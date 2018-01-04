package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_262 {
    private val production = Production16_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}