package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_30 {
    private val production = Production28_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}