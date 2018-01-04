package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_496 {
    private val production = Production7_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}