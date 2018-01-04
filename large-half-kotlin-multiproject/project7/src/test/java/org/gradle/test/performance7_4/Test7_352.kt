package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_352 {
    private val production = Production7_352("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}