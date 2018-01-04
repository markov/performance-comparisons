package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_496 {
    private val production = Production20_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}