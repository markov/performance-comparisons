package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_247 {
    private val production = Production48_247("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
