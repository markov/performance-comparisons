package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_86 {
    private val production = Production28_86("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}