package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_52 {
    private val production = Production28_52("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}