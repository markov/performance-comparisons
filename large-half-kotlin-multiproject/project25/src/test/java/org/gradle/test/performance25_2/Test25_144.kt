package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_144 {
    private val production = Production25_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}