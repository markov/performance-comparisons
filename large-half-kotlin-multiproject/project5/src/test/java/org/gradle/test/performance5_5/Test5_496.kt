package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_496 {
    private val production = Production5_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}