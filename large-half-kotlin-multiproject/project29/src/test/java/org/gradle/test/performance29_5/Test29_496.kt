package org.gradle.test.performance29_5

import org.junit.Assert.*

class Test29_496 {
    private val production = Production29_496("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}