package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_164 {
    private val production = Production48_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
