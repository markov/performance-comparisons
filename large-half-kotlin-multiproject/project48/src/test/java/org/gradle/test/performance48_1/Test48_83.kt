package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_83 {
    private val production = Production48_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
