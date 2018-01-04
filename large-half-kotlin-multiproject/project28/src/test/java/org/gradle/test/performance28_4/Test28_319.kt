package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_319 {
    private val production = Production28_319("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}