package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_496 {
    private val production = Production28_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}