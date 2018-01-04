package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_219 {
    private val production = Production48_219("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
