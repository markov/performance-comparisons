package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_298 {
    private val production = Production48_298("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
