package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_352 {
    private val production = Production31_352("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}