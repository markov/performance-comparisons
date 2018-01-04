package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_496 {
    private val production = Production35_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}