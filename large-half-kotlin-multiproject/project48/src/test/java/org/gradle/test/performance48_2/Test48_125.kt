package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_125 {
    private val production = Production48_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
