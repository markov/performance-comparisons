package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_352 {
    private val production = Production28_352("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}