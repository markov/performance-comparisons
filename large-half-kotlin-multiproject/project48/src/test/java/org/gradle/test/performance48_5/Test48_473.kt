package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_473 {
    private val production = Production48_473("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
