package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_278 {
    private val production = Production48_278("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
