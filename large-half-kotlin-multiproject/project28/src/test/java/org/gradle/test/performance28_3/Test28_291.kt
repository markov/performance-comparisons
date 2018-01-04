package org.gradle.test.performance28_3

import org.junit.Assert.*

class Test28_291 {
    private val production = Production28_291("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}