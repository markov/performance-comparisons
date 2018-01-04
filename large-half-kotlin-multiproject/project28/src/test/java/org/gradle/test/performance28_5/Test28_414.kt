package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_414 {
    private val production = Production28_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}