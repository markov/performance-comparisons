package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_352 {
    private val production = Production16_352("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}