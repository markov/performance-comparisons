package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_316 {
    private val production = Production28_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}