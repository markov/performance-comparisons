package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_30 {
    private val production = Production48_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
