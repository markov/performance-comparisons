package org.gradle.test.performance4_2

import org.junit.Assert.*

class Test4_144 {
    private val production = Production4_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}