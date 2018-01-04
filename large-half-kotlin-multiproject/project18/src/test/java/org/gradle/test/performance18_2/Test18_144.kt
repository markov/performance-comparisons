package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_144 {
    private val production = Production18_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}