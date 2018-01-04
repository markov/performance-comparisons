package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_245 {
    private val production = Production48_245("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
