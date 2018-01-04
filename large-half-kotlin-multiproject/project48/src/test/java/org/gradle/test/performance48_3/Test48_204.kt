package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_204 {
    private val production = Production48_204("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
