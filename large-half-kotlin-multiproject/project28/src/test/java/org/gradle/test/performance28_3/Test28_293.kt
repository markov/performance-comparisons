package org.gradle.test.performance28_3

import org.junit.Assert.*

class Test28_293 {
    private val production = Production28_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}