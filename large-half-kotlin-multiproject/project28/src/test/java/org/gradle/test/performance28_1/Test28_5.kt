package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_5 {
    private val production = Production28_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}