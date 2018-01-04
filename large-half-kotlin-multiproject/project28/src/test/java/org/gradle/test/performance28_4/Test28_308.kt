package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_308 {
    private val production = Production28_308("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}