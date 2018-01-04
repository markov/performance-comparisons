package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_37 {
    private val production = Production48_37("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
