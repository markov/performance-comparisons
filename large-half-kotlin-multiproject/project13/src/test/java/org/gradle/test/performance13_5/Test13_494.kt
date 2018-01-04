package org.gradle.test.performance13_5

import org.junit.Assert.*

class Test13_494 {
    private val production = Production13_494("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}