package org.gradle.test.performance28_2

import org.junit.Assert.*

class Test28_175 {
    private val production = Production28_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}