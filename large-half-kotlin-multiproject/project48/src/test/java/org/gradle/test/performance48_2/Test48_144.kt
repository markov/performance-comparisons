package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_144 {
    private val production = Production48_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
