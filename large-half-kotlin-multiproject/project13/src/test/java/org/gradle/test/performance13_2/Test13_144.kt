package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_144 {
    private val production = Production13_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}