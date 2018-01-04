package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_235 {
    private val production = Production48_235("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
