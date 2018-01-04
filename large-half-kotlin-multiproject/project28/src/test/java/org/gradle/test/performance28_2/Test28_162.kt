package org.gradle.test.performance28_2

import org.junit.Assert.*

class Test28_162 {
    private val production = Production28_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}