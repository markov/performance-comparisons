package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_266 {
    private val production = Production48_266("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
