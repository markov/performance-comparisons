package org.gradle.test.performance28_2

import org.junit.Assert.*

class Test28_140 {
    private val production = Production28_140("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}