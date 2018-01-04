package org.gradle.test.performance48_4

import org.junit.Assert.*

class Test48_384 {
    private val production = Production48_384("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
