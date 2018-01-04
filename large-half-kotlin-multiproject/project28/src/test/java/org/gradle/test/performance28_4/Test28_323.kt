package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_323 {
    private val production = Production28_323("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}