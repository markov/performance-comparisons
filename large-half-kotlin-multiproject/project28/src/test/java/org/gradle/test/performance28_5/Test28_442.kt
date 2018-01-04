package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_442 {
    private val production = Production28_442("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}