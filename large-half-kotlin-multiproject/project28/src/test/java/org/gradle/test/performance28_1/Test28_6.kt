package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_6 {
    private val production = Production28_6("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}