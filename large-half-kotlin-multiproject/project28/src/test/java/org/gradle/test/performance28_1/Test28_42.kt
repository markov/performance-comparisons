package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_42 {
    private val production = Production28_42("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}